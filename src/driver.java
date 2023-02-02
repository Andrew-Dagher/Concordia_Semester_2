
public class driver {

	public static void main(String[] args) {
		Parent t1 = new Child();
		//t1.print((byte)0);
		// baiscslly looks in the pointers class first to look for the method, but then sees that it is overriden in the child class 
	}
}
