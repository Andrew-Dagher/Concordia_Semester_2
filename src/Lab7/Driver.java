package Lab7;

public class Driver {

	public static void main(String[] args) {
		
		Computer comp = new Computer("BIG COMPUTER", 16, 512);

		ClassHandler handle = new ClassHandler(comp,  "computer.txt");
		
	
		
		handle.writeToFile("MYname");
		
		
		handle.readFromFile();
		
		
		
		
		
		
		
	}

}
