package Lab9;

public class Driver {
	
	public static String[] splitIgnoringQuotes(String input) {
	    String[] result = new String[countCommas(input) + 1];
	    int index = 0;
	    boolean inQuotes = false;
	    int startIndex = 0;

	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        if (c == '"') {
	            inQuotes = !inQuotes;
	        } else if (c == ',' && !inQuotes) {
	            result[index++] = input.substring(startIndex, i);
	            startIndex = i + 1;
	        }
	    }
	    result[index++] = input.substring(startIndex);
	    return result;
	}

	public static int countCommas(String input) {
	    int count = 0;
	    boolean inQuotes = false;

	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        if (c == '"') {
	            inQuotes = !inQuotes;
	        } else if (c == ',' && !inQuotes) {
	            count++;
	        }
	    }
	    return count;
	}

	
	public static void main(String[] args) {
		String[]  line = splitIgnoringQuotes("heloo,world");
		for(String t : line) {
			System.out.println(t);
		}
	
	



	}

}
