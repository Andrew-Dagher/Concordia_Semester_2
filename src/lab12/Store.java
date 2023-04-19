package lab12;

public class Store implements Comparable<Store>{
	private double sale;
	private String storeName;
	
	public Store() {
		this.sale = 0;
		this.storeName = null;
	}
	
	public Store(double sale, String storeName) {
		this.sale = sale;
		this.storeName = storeName;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@Override
	public String toString() {
		return "Store [sale=" + sale + ", storeName=" + storeName + "]";
	}

	@Override
	public int compareTo(Store o) {
		if(this.getSale() == o.getSale() && this.getStoreName() ==  o.getStoreName() ){
			return 1;
		}
		return 0;
	}
	
	
	
	
	
	
}
