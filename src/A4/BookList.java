package A4;

public class BookList {

	public Node head;
	
	public BookList() {
		head = null;
	}
	
	public void addToStart(Book b) {
		head = new Node(b,null);
	}
	
	
	public void storeRecordsByYear(int yr) {
		
	}
	
	
	
	
	
	
	
	

	
	private class Node{
		
		private Book curr;
		private Node nextNode;

		public Node(Book b, Node next) {
			this.curr = b;
			this.nextNode = next;
		}

		
		
	}
	
	
	
	
}
