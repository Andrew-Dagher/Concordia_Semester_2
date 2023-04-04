package lab11;

import java.util.ArrayList;

public class StringDemo {
	

	
	public ArrayList<String> stringStore = new ArrayList<String>();

	public StringDemo() {
		this.stringStore =null;
	}
	public StringDemo(ArrayList<String> stringStore) {
		this.stringStore = stringStore;
	}
	
	
	public ArrayList<String> getStringStore() {
		return stringStore;
	}
	public void setStringStore(ArrayList<String> stringStore) {
		this.stringStore = stringStore;
	}
	
	
	public void printStore() {
		for (int i = 0; i < this.stringStore.size(); i++) {
		      System.out.println(this.stringStore.get(i));
		    }
	}
	
	public int getSize() {
		int size = this.stringStore.size();
		return size;
	}
	
	public int checkString(String s) {
		if(stringStore.contains(s)) {
			return stringStore.indexOf(s);
		}else return -1;
	}
	public boolean emptyCheck() {
		if(stringStore.isEmpty()) {
			return true;
		}
		else return false;
	}
	
	public void addString(String s) {
		stringStore.add(s);
	}
	
	public void addString(String s,int x) {
		stringStore.add(x, s);;
	}
	
	public void removeString(String s) {
		stringStore.remove(s);
	}
	public static boolean compareStore(StringDemo obj1, StringDemo obj2) {
		
		if(obj1.stringStore.equals(obj2.stringStore)) {
			return true;
		}
		else return false;
		
		
	}
	
	
	
	
	
	

}
