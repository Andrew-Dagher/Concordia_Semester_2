package lab12;

import A4.Book;

public class LinkedList {

	private Node head;
	private int size;
	
	class Node{
			
		
		private Store store;
		private Node next;
		
		
	}

	public LinkedList(){
		this.head = null;
		this.size = 0;
		
	}
	public LinkedList(Node head, int size) {
		
		this.head = head;
		this.size = size;
	}
	
	
	public void insert(Store s) {
	    LinkedList newLinkedList = new LinkedList();
	    newLinkedList.head = new Node();
	    newLinkedList.head.store = s;
	    if (head == null) {
	        // If the list is empty, add the new linked list as the head
	        head = newLinkedList.head;
	    } else if (s.getSale() >= head.store.getSale()) {
	        // If the new store's sale is greater than or equal to the head's sale, insert it at the beginning
	        newLinkedList.head.next = head;
	        head = newLinkedList.head;
	    } else {
	        // Find the appropriate position to insert the new linked list in the descending order
	        Node curr = head;
	        while (curr.next != null && curr.next.store.getSale() > s.getSale()) {
	            curr = curr.next;
	        }
	        newLinkedList.head.next = curr.next;
	        curr.next = newLinkedList.head;
	    }
	    size++;
	}

	public void remove(Store s) {
	    if (head == null) {
	        // If the list is empty, there is nothing to remove
	        return;
	    } else if (head.store.compareTo(s) == 1) {
	        // If the head node matches the store object to remove, remove it
	        head = head.next;
	        size--;
	        return;
	    } else {
	        // Traverse the list to find the node to remove
	        Node prev = head;
	        Node curr = head.next;
	        while (curr != null) {
	            if (curr.store.compareTo(s) == 1) {
	                prev.next = curr.next;
	                size--;
	                return;
	            }
	            prev = curr;
	            curr = curr.next;
	        }
	    }
	}
	@Override
	public String toString() {
	    if (head == null) {
	        // If the list is empty, return an empty string
	        return "";
	    }
	    // Traverse the list and concatenate the string representation of each node
	    String result = "";
	    Node curr = head;
	    while (curr != null) {
	        result += curr.store.toString() + "\n";
	        curr = curr.next;
	    }
	    return result;
	}


	
	
}
