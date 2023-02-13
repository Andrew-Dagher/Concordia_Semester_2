package labs;

public  abstract class  Cafe {
	
	protected double fee;
	protected String location;
	
	
	@Override
	public String toString() {
		return "Cafe fee is " + fee + ", and the location is" + location ;
	}
	
	public abstract double compute_TotalBill();
	public abstract String information();
	
	
}
