package A3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Driver {
	
//	public static String errors[]=;
//	public static String genres[]=;
	
	
	
	//will check if initial file opens
	
	public static void checkeFiles(String initial_File_Name){
		Scanner sc = null;
		String[] fileNames = null;
		try {
			sc = new Scanner(new FileInputStream(initial_File_Name));
		
			boolean first_line = true;
			int num_of_files =0;
			
			int counter = 0;
			
			
			
			while(sc.hasNextLine()) {
				
				while(first_line) {
					num_of_files = Integer.parseInt(sc.nextLine());
					fileNames = new String[num_of_files];
					first_line = false;
				}
				
				
				String check = sc.nextLine();
				try {
					Scanner sc2 = new Scanner(new FileInputStream(check));
					fileNames[counter] = check;
					System.out.println(fileNames[counter]);
					counter++;
					
										
				}
				catch(FileNotFoundException e) {
					System.out.println(check + " is non existent");
					continue;
				}
			
			
			}
		
		
		}
		catch(FileNotFoundException e) {
			System.out.println(initial_File_Name + " does not exist");
			
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
		String[] new_fileNames = new String[new_size];
		
		int index = 0;
		
		for(int i = 0; i<fileNames.length;i++) {
			
			if(fileNames[i]==null) continue;
			
			new_fileNames[index]=fileNames[i];
			index++;
		}
		
		System.out.println("-----------------");
		
		for(String files :new_fileNames) {
			System.out.println(files);
		
		sc.close();
		
		
		}
		
	}

	public static void main(String[] args) {
		checkeFiles("part1_input_file_names.txt");

	}

}
