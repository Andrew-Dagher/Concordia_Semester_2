package TUT;

public class TUT1{
	
	public static void main (String[] args) {
	String S1 = "ABC";
	String S2 = new String( "ABC"); // the new keyword makes the reference difference... if no NEW then same reference.
	
	if (S1 == S2) {
		System.out.println("poop1");
	}

	if (S1.equals(S2)) {
		System.out.println("poop2");
	}
	
	}
}

	