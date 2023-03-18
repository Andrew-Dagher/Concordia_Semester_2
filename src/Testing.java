
public class Testing {
	public static void fun1(Parent a1) {
		GrandChild c1 = new GrandChild();
		if(a1.equals(c1)) {
			System.out.println("goood");
		}else System.out.println("noooo");
	}
}

