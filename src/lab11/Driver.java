package lab11;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		 ArrayList<String> A1 = new ArrayList<String>();
		 ArrayList<String> A2 = new ArrayList<String>();
		 ArrayList<String> A3 = new ArrayList<String>();
		
		
		A1.add("hi");
		A1.add("hoho");
		
		A2.add("hi");
		A2.add("hoho");
		
		A3.add("hello");
		A2.add("hi");
		A3.add("HOHO");
		
		
		StringDemo S1 = new StringDemo();
		StringDemo S2 = new StringDemo();
		StringDemo S3 = new StringDemo(A1);
		StringDemo S4 = new StringDemo(A2);
		StringDemo S5 = new StringDemo(A3);

		
		S4.printStore();
		System.out.println();

		System.out.println(S3.getSize());
		System.out.println();
		

		System.out.println(S5.checkString("HOHO"));
		System.out.println();
		
		System.out.println(S3.emptyCheck());
		System.out.println();
		
		S3.addString("hehehe",1);
		S3.removeString("hi");
		
		System.out.println(StringDemo.compareStore(S4, S5));
		
		
		
		
		
		
		
		
		
	}

	private static char[] compareStore(StringDemo s3, StringDemo s4) {
		// TODO Auto-generated method stub
		return null;
	}

}
