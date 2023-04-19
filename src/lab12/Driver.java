package lab12;

public class Driver {

	public static void main(String[] args) {
		
		
		LinkedList L = new LinkedList();
		
		Store s1 = new Store(11,"bob");
		Store s2 = new Store(15,"pole");
		Store s3 = new Store(13,"low");
		
		L.insert(s1);
		L.insert(s2);
		L.insert(s3);
		
		L.remove(s2);
		System.out.println(L.toString());

	}

}
