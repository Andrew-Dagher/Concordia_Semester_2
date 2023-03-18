package Lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassHandler {

	
	
	private  Computer computer;
	private String path;
	
	
	
	public ClassHandler(Computer computer, String path) {
		super();
		this.computer = computer;
		this.path = path;
	}
	
	
	public void writeToFile(String fileName)  {
		 try {
	            FileWriter fileWriter = new FileWriter(fileName);
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	            
	            bufferedWriter.write(toString());
	            
	            bufferedWriter.close();
	            
	            System.out.println("Successfully wrote to file " + fileName);
	            
	            
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to file " + fileName);
	            e.printStackTrace();
	        }
	    }
	    
		
	
	public Computer readFromFile() {
		
		String filePath = this.path;
        Computer computer = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String CPU = br.readLine();
            int RAM = Integer.parseInt(br.readLine());
            int storage = Integer.parseInt(br.readLine());
            
            computer = new Computer(CPU, RAM, storage);
            System.out.println("Successfully read from file " + filePath);
            
        } catch (IOException e) {
            System.err.println("Error reading from file " + filePath);
            e.printStackTrace();
        }

        return computer;
	}
	

}
