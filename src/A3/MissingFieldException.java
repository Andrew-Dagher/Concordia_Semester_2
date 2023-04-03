package A3;

import java.io.PrintWriter;

public class MissingFieldException extends Exception{

	public MissingFieldException(String name,String errorType, String errorLine, PrintWriter pw) {
		
		pw.println("syntax error in file: "+name
				+ "\n====================\n"
				+ "Error: "+errorType +"\n"
				+ "Record: "+ errorLine+"\n");
	}	
}
