import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
//baiscslly looks in the pointers class first to look for the method, but then sees that it is overriden in the child class
		//if static, it sees in pointers class and stops there.
		
public class driver {
	
	

	public static void main(String[] args) {

		Parent c1 = new GrandChild();
		
		Child c2 = (Child) c1;
		
		
		
		
		System.out.println();
		GrandChild c3 = (GrandChild)c2;
//		
		System.out.println();
		c2.test();
		c2.test2();
		c2.test3();
//		Big b = new Big();
//		b.print();
//		Big s = new small();
//		s.print();
//	
//	PrintWriter pw = null;
//	Scanner Scanner = null; 
//	
//	try {
//		pw = new PrintWriter(new FileOutputStream("Helloooooo"));
//		 Scanner = new Scanner(new FileInputStream("Helloooooo"));
//		
//	}
//	catch(FileNotFoundException e) {
//		e.getStackTrace();
//			System.out.println("error");
//		}
//	catch(IOException e) {
//		System.out.println("error io");
//	}
//	
//	
//	pw.println("ejhfefref\nrrefvrv\nrtgrgtrt\ng4tg4rgt\n4gtrgret\n");
//	pw.close();
//	
//
//	while(Scanner.hasNextLine()) {
//		 
//		System.out.println(Scanner.nextLine());
//		
//	}
//	
//	Scanner.close();
//	
//	
	}
}
