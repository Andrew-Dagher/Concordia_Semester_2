package labs;

public class DriverCafe {

	public static void main(String[] args) {
	
		
		BreakfastMenu c1 = new BreakfastMenu();
		BreakfastMenu c2 = new BreakfastMenu();
		DrinksMenu d1 = new DrinksMenu();
		DrinksMenu d2 = new DrinksMenu();

		Cafe[] array = new Cafe[4];
		
		array[0]=c1;
		array[1]=c2;
		array[2]=d1;
		array[3]=d2;
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i].information());
			System.out.println(array[i].compute_TotalBill());
			System.out.println();
		}
		
	}

}
