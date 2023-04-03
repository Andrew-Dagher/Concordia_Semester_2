package A3;

import java.io.PrintWriter;

public class BadIsbn13Exception extends Exception{
	
	public BadIsbn13Exception(String name,String errorType, String errorLine, PrintWriter pw) {

		pw.println("semantic error in file: "+name
				+ "\n====================\n"
				+ "Error: "+errorType +"\n"
				+ "Record: "+ errorLine+"\n");
		
	}

}