package A3;

import java.io.PrintWriter;

public class TooFewFieldsException extends Exception{

	
	public TooFewFieldsException(String name,String errorType, String errorLine, PrintWriter pw) {
		
		pw.println("syntax error in file: "+name
				+ "\n====================\n"
				+ "Error: "+errorType +"\n"
				+ "Record: "+ errorLine+"\n");
	}		
		
}
