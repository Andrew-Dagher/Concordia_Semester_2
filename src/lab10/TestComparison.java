package lab10;

public class TestComparison {

	public static void main(String[] args) {
		University U1 = new University(2,12.5);
		University U2 = new University(3,23.5);
		Journal_paper J1 = new Journal_paper(22.6,2);
		Journal_paper J2 = new Journal_paper(55.1,6);
		
		
		System.out.println(J1.Top_rank(J2));
		System.out.println(J2.Top_rank(J1));	
		System.out.println(U1.Top_rank(U2));
		System.out.println(U2.Top_rank(U1));
		
		
		
		System.out.println(J1.Low_rank(J2));
		System.out.println(J2.Low_rank(J1));
		System.out.println(U1.Low_rank(U2));
		System.out.println(U2.Low_rank(U1));	
		
		
		

	}

}
