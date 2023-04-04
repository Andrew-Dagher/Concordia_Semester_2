package A3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
//-----------------------------------------------------
//Assignment 3
//Question: Part 1-2-3
//Written by: Kevin Shibu Chacko 40241154 & Andrew Harissi Dagher 40247726 
//
//-----------------------------------------------------

/**
 * Driver Class where main method is implemented
 * @author Kevin Shibu Chacko
 * @author Andrew Harissi Dagher
 *
 */

public class Driver implements Serializable{
	
	
	public static String[] fileNames = null;
	public static String[] new_fileNames = null;
	public static String genres[]={"CCB","HCB","MTV","MRB","NEB","OTR","SSM","TPA"};
	public static String genreFiles[]={"Cartoons_Comics_Books.csv","Hobbies_Collectibles_Books.csv","Movies_TV.csv","Music_Radio_Books.csv","Nostalgia_Eclectic_Books.csv","Old_Time_Radio.csv","Sports_Sports_Memorabilia.csv","Trains_Planes_Automobiles.csv"};
	public static String genreFilesBook[]={"Cartoons_Comics_Books.csv.ser","Hobbies_Collectibles_Books.csv.ser","Movies_TV.csv.ser","Music_Radio_Books.csv.ser","Nostalgia_Eclectic_Books.csv.ser","Old_Time_Radio.csv.ser","Sports_Sports_Memorabilia.csv.ser","Trains_Planes_Automobiles.csv.ser"};
	
	static Book[] books_CCB;
    static Book[] books_HCB;
    static Book[] books_MTV;
    static Book[] books_MRB;
    static Book[] books_NEB;
    static Book[] books_OTR;
    static Book[] books_SSM;
    static Book[] books_TPA;
    
 
	//will check if initial file opens
	/**
	 * Method checks if file can be opened and if not will throw exception.It will then put all good files into an arrahy of good files.
	 * @param initial_File_Name
	 */
	public static void checkFiles(String initial_File_Name){
		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileInputStream(initial_File_Name));
		
			boolean first_line = true;
			int num_of_files =0;
			Scanner sc2=null;
			int counter = 0;
			
			
			
			while(sc.hasNextLine()) {
				
				while(first_line) {
					num_of_files = Integer.parseInt(sc.nextLine());
					fileNames = new String[num_of_files];
					first_line = false;
				}
				
				
				String check = sc.nextLine();
				try {
					 sc2 = new Scanner(new FileInputStream(check));
					fileNames[counter] = check;
					counter++;
					
										
				}
				catch(FileNotFoundException e) {
					continue;
				}
				sc2.close();
			
			
			}
		
		
		}
		catch(FileNotFoundException e) {

			
		}
		
		
		//get rid of null for the by making a new array:
		int new_size = 0;
		
		//creating the new size:
		for (String file : fileNames) {
			if(file == null) {
				continue;
			}
			new_size++;
		}
		
		//making the new array to store the file names:
		new_fileNames = new String[new_size];
		
		int index = 0;
		
		for(int i = 0; i<fileNames.length;i++) {
			
			if(fileNames[i]==null) continue;
			
			new_fileNames[index]=fileNames[i];
			index++;
		}
		

		sc.close();
		
	}	
	/**
	 * method splits elements in file according to the number of commas,if there is comm in between quotes,it will disregard it.
	 * @param input
	 * @return parts
	 */
	public static String[] splitString(String input) {
		String[] parts = input.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)",6);

		
		return parts;
	}
	/**
	 * method will write good good lines after checking syntax errors into their respective genre files
	 * @param array
	 * @param Line
	 */
	public static void writeGenreFile(String[] array, String Line) {
		
			for(int j = 0 ; j<genres.length;j++){
				
				try {
					
					if(genres[j].equals(array[4].trim())) {
						
						PrintWriter pw = new PrintWriter(new FileOutputStream(genreFiles[j],true));
		            	
						pw.println(Line);
					
						pw.close();
				}
				
				}
				catch(FileNotFoundException e) {
					continue;
				}
					
			}	
	
	
		
	}
	/**
	 * method will write good book arrays into specific serialized files 
	 * @param genrearr
	 * @param file_name
	 */
	public static void writeGenreFileBook(Book[] genrearr,String file_name ) {
		try {
		
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(file_name));
		out.writeObject(genrearr);
		out.close();
		
		} 
		
		catch (IOException e) {
		e.printStackTrace();
		}
		
	}
	/**
	 * method will add book into its specific array 
	 * @param b
	 * @param genre
	 */
	public static void addBook(Book b, String genre) {
	    
	    switch (genre) {
	        case "CCB":
	            if (books_CCB == null) {
	                books_CCB = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_CCB.length + 1];
	                System.arraycopy(books_CCB, 0, b1, 0, books_CCB.length);
	                b1[books_CCB.length] = b;
	                books_CCB = b1;
	            }
	            break;
	        case "HCB":
	            if (books_HCB == null) {
	                books_HCB = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_HCB.length + 1];
	                System.arraycopy(books_HCB, 0, b1, 0, books_HCB.length);
	                b1[books_HCB.length] = b;
	                books_HCB = b1;
	            }
	            break;
	        case "MTV":
	            if (books_MTV == null) {
	                books_MTV = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_MTV.length + 1];
	                System.arraycopy(books_MTV, 0, b1, 0, books_MTV.length);
	                b1[books_MTV.length] = b;
	                books_MTV = b1;
	            }
	            break;
	        case "MRB":
	            if (books_MRB == null) {
	                books_MRB = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_MRB.length + 1];
	                System.arraycopy(books_MRB, 0, b1, 0, books_MRB.length);
	                b1[books_MRB.length] = b;
	                books_MRB = b1;
	            }
	            break;
	        case "NEB":
	            if (books_NEB == null) {
	                books_NEB = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_NEB.length + 1];
	                System.arraycopy(books_NEB, 0, b1, 0, books_NEB.length);
	                b1[books_NEB.length] = b;
	                books_NEB = b1;
	            }
	            break;
	        case "OTR":
	            if (books_OTR == null) {
	                books_OTR = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_OTR.length + 1];
	                System.arraycopy(books_OTR, 0, b1, 0, books_OTR.length);
	                b1[books_OTR.length] = b;
	                books_OTR = b1;
	            }
	            break;
	        case "SSM":
	            if (books_SSM == null) {
	                books_SSM = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_SSM.length + 1];
	                System.arraycopy(books_SSM, 0, b1, 0, books_SSM.length);
	                b1[books_SSM.length] = b;
	                books_SSM = b1;
	            }
	            break;
	        case "TPA":
	            if (books_TPA == null) {
	                books_TPA = new Book[] {b};
	            } else {
	                Book[] b1 = new Book[books_TPA.length + 1];
	                System.arraycopy(books_TPA, 0, b1, 0, books_TPA.length);
	                b1[books_TPA.length] = b;
	                books_TPA = b1;
	            }
	            break;
	    }
	}
    /**
     * part1 method will check for all syntax errors and then move all good lines into their specific genre files 
     */
	public static void do_part1() {
		
		checkFiles("part1_input_file_names.txt");
		
		PrintWriter pw = null;
		String[] arr = null;
		String line = "";
		Scanner sc = null;
	    
		for(int i = 0; i<new_fileNames.length;i++) {
		

			try {
				 pw = new PrintWriter(new FileOutputStream("syntax_error_file.txt",true));
				 sc = new Scanner(new FileInputStream(new_fileNames[i]));
				
				while(sc.hasNextLine()) {
					try {

					    line = sc.nextLine();
					    arr = splitString(line);
					    int quote_count = 0;
					    int comma_count = 0;
					    int tot_comma_count = 0;
					    
					    
					  			   
					    for(int z =0; z<line.length();z++) {
					    	
					    	if(line.charAt(z) == '"') {
					    		quote_count++;
					    	}
					    	if(quote_count == 2) {
						    	if(line.charAt(z) == ',') {
						
						    		comma_count++;
						    	}
						    	
					    	}
					    	if(line.charAt(z) == ',') {
					    		tot_comma_count++;
					    	}
					    }
						    
						    if(tot_comma_count<5) {//Too Few Fields
						    	throw new TooFewFieldsException(new_fileNames[i],"Too Few Fields", line, pw);
				            	
							}
						    if(quote_count>0 && comma_count<5 ) {
						    	throw new TooFewFieldsException(new_fileNames[i],"Too Few Fields", line, pw);
				            	
						    }
						    
					    

						//MISSING OR TOO MUCH FIELDS
						if(arr[5].contains(",")) {
							throw new TooManyFieldsException(new_fileNames[i],"Too Few Fields", line, pw);
							
						}

						//MISSING FIELDS:
					    if(arr[0].equals("")) {//Missing title
					    	throw new MissingFieldException(new_fileNames[i],"Missing Title", line, pw);
				           
				            }
							else if(arr[1].equals("")) {//Missing author
								throw new MissingFieldException(new_fileNames[i],"Missing Author", line, pw);
				            	
				            }
							else if(arr[2].equals("")) {//missing price
								throw new MissingFieldException(new_fileNames[i],"Missing Price", line, pw);
								 
							   }
							else if(arr[3].equals("")) {//Missing isbn
								throw new MissingFieldException(new_fileNames[i],"Missing ISBN", line, pw);
				            	
				            }
							else if(arr[4].equals("")) {//Missing genre
								throw new MissingFieldException(new_fileNames[i],"Missing Genre", line, pw);
				            	
				            }
							else if(arr[5].equals("")) {//Missing Year
								throw new MissingFieldException(new_fileNames[i],"Missing Year", line, pw);
								
							}
							
							//INVALID FIELDS and PRINTING THE GOOD ONES in corresponding file:
							for(int j = 0 ; j<genres.length;j++){
								 
								if(genres[j].equals(arr[4])) {//good genres being put in corresponding files
					            	
									writeGenreFile(arr, line);
									break;
								}
								
								 if (genres.length == j+1){//invalid genres
									throw new UnknownGenreException(new_fileNames[i],"Unknown Genre", line, pw);
								}
								
						
									
									
								}
					}
					catch(UnknownGenreException e) {
						continue;
					}
					catch(MissingFieldException e) {
						continue;
					}
					catch(TooFewFieldsException e) {
						continue;
					}
					catch(TooManyFieldsException e) {
						continue;
					}
				}
				
			}
			
			catch(FileNotFoundException e) {
				System.out.println("file not found");
				continue;
			} catch (NullPointerException e) {
				System.out.println("Found empty file");
				continue;
			}
			pw.close();
			sc.close();	
		}
	
	
	}
	/**
	 * part 2 method will check for semantic errors in those specific files then create book objects and put those book objects into specific arrays of the genres
	 */
	public static void do_part2(){

		
		Book b = null;
		PrintWriter pw2 = null;
		Scanner sc2=null;
		String[] arr2=null;
		
		for(int i=0;i<genreFiles.length;i++){
		try{
		   pw2 = new PrintWriter(new FileOutputStream("semantic_error_file.txt",true));
		   sc2=new Scanner(new FileInputStream(genreFiles[i]));
		   
		 
		   while(sc2.hasNextLine()){
			   	int sum10=0;
				int sum13=0;
				String line="";
				line=sc2.nextLine();
				arr2=splitString(line);
				
				try {
				if(arr2[3].length()==10){
			
					for(int j=0,k=10;j<10;j++,k--) {
						if(arr2[3].contains("X")){
							throw new BadIsbn10Exception(genreFiles[i],"Invalid ISBN 10",line,pw2);
						}
						
							int d=Character.getNumericValue(arr2[3].charAt(j));
							
							sum10+=d*k;
						
						
					}
					if (sum10%11!=0) {
						throw new BadIsbn10Exception(genreFiles[i],"Invalid ISBN 10",line,pw2);
					}
				}
				
				if(arr2[3].length()==13){
					
					for(int j=0;j<13;j++) {
						
							int d=Character.getNumericValue(arr2[3].charAt(j));
							if (j%2 !=0) {
								sum13+=3*d;
							}
							else sum13+=d;	
					}
					if (sum13%10!=0) {
						throw new BadIsbn13Exception(genreFiles[i],"Invalid ISBN 13",line,pw2);
					}
				}
				
				if(Double.parseDouble(arr2[2])<0) {//bad year
					throw new BadPriceException(genreFiles[i],"Invalid Price",line,pw2);
				}
				
				if(Integer.parseInt(arr2[5])<1995 ||Integer.parseInt(arr2[5])>2010 ) {
					throw new BadYearException(genreFiles[i],"Invalid Year",line,pw2);
				}
				
				b = new Book(arr2[0],arr2[1],Double.parseDouble(arr2[2]),arr2[3],arr2[4],Integer.parseInt(arr2[5]));
				
				
               addBook(b,arr2[4]);
               
                	
				
				}catch(BadIsbn10Exception e) {
					pw2.close();
					continue;
				} catch (BadIsbn13Exception e) {
					pw2.close();
					continue;
				} catch (BadYearException e) {
					pw2.close();
					continue;
				} catch (BadPriceException e) {
					pw2.close();
					continue;
				}
				
		   }
		   
		   
		   if (arr2[4].equals("CCB")) {
			   writeGenreFileBook(books_CCB,"Cartoons_Comics_Books.csv.ser");
		   }
		   else if(arr2[4].equals("HCB")) {
			   writeGenreFileBook(books_HCB,"Hobbies_Collectibles_Books.csv.ser");
		   } 
		   else if(arr2[4].equals("MTV")) {
			   writeGenreFileBook(books_MTV,"Movies_TV.csv.ser");
		   } 
		   else if(arr2[4].equals("MRB")) {
			   writeGenreFileBook(books_MRB,"Music_Radio_Books.csv.ser");
		   } 
		   else if(arr2[4].equals("NEB")) {
			   writeGenreFileBook(books_NEB,"Nostalgia_Eclectic_Books.csv.ser");
		   } 
		   else if(arr2[4].equals("OTR")) {
			   writeGenreFileBook(books_OTR,"Old_Time_Radio.csv.ser");
		   } 
		   else if(arr2[4].equals("SSM")) {
			   writeGenreFileBook(books_SSM,"Sports_Sports_Memorabilia.csv.ser");
		   } 
		   else if(arr2[4].equals("TPA")) {
			   writeGenreFileBook(books_TPA,"Trains_Planes_Automobiles.csv.ser");
		   }
		   
			
		}
		
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}
		pw2.close();
		sc2.close();
		}
		
		
		
	
			
		
	}
	/**
	 * part 3 method will deserialize all array objects and output menu.Where user can check books in specific file.
	 */
	public static String currentFile="";
	public static int num=0;
	public static int currentIndex=0;
	public static Book[][] arr3 = new Book[genreFilesBook.length][];
	public static void do_part3(){
	    int index = 0;
	    ObjectInputStream ois = null;
	  
	    //saving the books in their appropriate array. 
	    for (int i = 0; i < genreFilesBook.length; i++) {
	        try {
	            ois = new ObjectInputStream(new FileInputStream(genreFilesBook[i]));
	            
	            while (true) {
	                Book[] b = (Book[]) ois.readObject();
	                arr3[i] = b;
	                
	            }
	            
	        }
	        
	        catch (EOFException e) {
	            index++;
	            continue;
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + genreFilesBook[i] + "\n");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Class not found exception occurred");  
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	   
	    try {
	        ois.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    Scanner sc = new Scanner(System.in);
        String input;
     
        do {
            System.out.println("-----------------------------");
            System.out.println("         Main Menu           ");
            System.out.println("-----------------------------");
            System.out.println("v View the selected file:"+currentFile);
            System.out.println("s Select a file to view" );
            System.out.println("x Exit");
            System.out.print("Enter your choice: ");
            input = sc.nextLine().toLowerCase();
            System.out.println();
            if(input.equals("v")) {
              openFile();
            }
            
            else if(input.equals("s")) {
                selectFile(sc);
            }
            else if(input.equals("x")){
            	System.out.println("Exiting Program");
                System.exit(0);
            }
            else {
            	System.out.println("Invalid choice");
            }
            
        } 
        while (!input.equals("x"));
        
    }
	/**
	 * When use click s this method starts and displays sub menu where use can change what file they want to see
	 * @param sc
	 */
	public static void selectFile(Scanner sc) {
		int input = 0;
		
		System.out.println("------------------------------");
		System.out.println("         File Sub-Menu        ");
		System.out.println("------------------------------");
		System.out.println("1 Cartoons_Comics_Books.csv.ser        ("+arr3[0].length+" records)");
		System.out.println("2 Hobbies_Collectibles_Books.csv.ser   ("+arr3[1].length+" records)");
		System.out.println("3 Movies_TV.csv.ser                    ("+arr3[2].length+" records)");
		System.out.println("4 Music_Radio_Books.csv.ser            ("+arr3[3].length+" records)");
		System.out.println("5 Nostalgia_Eclectic_Books.csv.ser     ("+arr3[4].length+" records)");
		System.out.println("6 Old_Time_Radio.csv.ser               ("+arr3[5].length+" records)");
		System.out.println("7 Sports_Sports_Memorabilia.csv.ser    ("+arr3[6].length+" records)");
		System.out.println("8 Trains_Planes_Automobiles.csv.ser    ("+arr3[7].length+" records)");
		System.out.println("9 Exit");
		System.out.println("------------------------------");
		System.out.println();
		System.out.print("Enter your choice: ");
		input=sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		if(input==1) {
			currentFile="Cartoons_Comics_Books.csv.ser      ("+arr3[0].length+" records)";
			num=0;
		}
		else if(input==2) {
			currentFile="Hobbies_Collectibles_Books.csv.ser      ("+arr3[1].length+" records)";
			num=1;
			
		}
		else if(input==3) {
			currentFile="Movies_TV.csv.ser      ("+arr3[2].length+" records)";
			num=2;
		}
		else if(input==4) {
			currentFile="Music_Radio_Books.csv.ser      ("+arr3[3].length+" records)";
			num=3;
		}
		else if(input==5) {
			currentFile="Nostalgia_Eclectic_Books.csv.ser      ("+arr3[4].length+" records)";
			num=4;
		}	
		else if(input==6) {
			currentFile="Old_Time_Radio.csv.ser      ("+arr3[5].length+" records)";
			num=5;
		}else if(input==7) {
			currentFile="Sports_Sports_Memorabilia.csv.ser      ("+arr3[6].length+" records)";
			num=6;
		}else if(input==8) {
			currentFile="Trains_Planes_Automobiles.csv.ser      ("+arr3[7].length+" records)";
			num=7;
		}
	     else if(input==9);
	    	 
	}
	/**
	 * When user presses v this method allows them to go through each book object from the file
	 */
	public static void openFile() {
		 Scanner sc= new Scanner(System.in);
	     int n;
	     boolean k=true;
	     while(k) {
	     System.out.print("Enter a number:");
	     n=sc.nextInt();
	     if(n==0) {
	    	 System.out.println("\nReturning to Main Menu");
	    	 k=false;
	     }
	     else if (n>0) {
	    	 displayObjects(currentIndex, currentIndex + n - 1);
	     }
	     else {
	    	 displayObjects(currentIndex + n, currentIndex - 1);
	     }
	     }

	}
	public static void displayObjects(int startIndex, int endIndex) {
		if (startIndex < 0) {
            System.out.println("\nBOF has been reached.");
            startIndex = 0;
        }
        if (endIndex >= arr3[num].length) {
            System.out.println("\nEOF has been reached.");
            endIndex = arr3[num].length - 1;
        }
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(arr3[num][i]);
            System.out.println();
        }
        currentIndex = endIndex;
    }
	
	

    /**]
     * Main method allows to executes part1,2 and 3 methods.
     * @param args
     */
	public static void main(String[] args) {
		
		do_part1();
		do_part2();
		do_part3();
		
		
		
		
		

	}

}