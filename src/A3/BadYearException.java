package A3;

import java.io.PrintWriter;

public class BadYearException extends Exception{
	
	public BadYearException(String name,String errorType, String errorLine, PrintWriter pw) {

		pw.println("semantic error in file: "+name
				+ "\n====================\n"
				+ "Error: "+errorType +"\n"
				+ "Record: "+ errorLine+"\n");
		
	}

}
