package labs;

public class BreakfastMenu extends Cafe{

	protected double item_price;
	
	protected int no_of_items;
	
	@Override
	public String toString() {
		return "BreakfastMenu has item price of " + item_price + ", and number of items is" + no_of_items;
	}
	
	public double compute_TotalBill() {
		return super.fee + this.item_price * this.no_of_items;
	}
	
	public String information() {
		return "The total bill of the Breakfast at cafe is "+compute_TotalBill()+". The cafe is located in this "+super.location+" city and entry fees are "+super.fee+"$. The no of items ordered is "+this.no_of_items+" and the price of each item is "+this.item_price;
	}
	
}
