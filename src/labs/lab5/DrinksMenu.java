package labs;

public class DrinksMenu extends Cafe{

	protected double drink_price;
	protected boolean extra_soda;
	
	
	
	
	@Override
	public String toString() {
		return "For DrinksMenu, drink_price is " + drink_price + ", and extra_soda is" + extra_soda;
	}
	
	public double compute_TotalBill() {
		return(extra_soda)? 30+super.fee+drink_price:super.fee+drink_price;
	}
	
	public String information() {
		return"the total bill of the Drinks at the cafe is "+drink_price+"$. The cafe is located  in this "+super.location+" city and entry fees is "+super.fee+"$. The price of this drink is"+compute_TotalBill();
	}
	
}
