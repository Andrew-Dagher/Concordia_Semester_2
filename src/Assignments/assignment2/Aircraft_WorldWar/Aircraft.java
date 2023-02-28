package Assignments.assignment2.Aircraft_WorldWar;

import Assignments.assignment2.Parent;

public class Aircraft extends Parent {
	double price;
	double maxElevation;
	
	public Aircraft(){
		this.price=0;
		this.maxElevation=0;
	}
	public Aircraft(double price,double elevation){
		this.price=price;
		this.maxElevation=elevation;
	}
	public Aircraft(Aircraft a){
		this.price=a.price;
		this.maxElevation=a.maxElevation;
	}
	public double getprice() {
		return this.price;
	}
	public double getmaxElevation() {
		return this.maxElevation;
	}
	protected void setprice(double price) {
		this.price=price;
	}
	protected void setmaxElevation(double elevation) {
		this.maxElevation=elevation;
	}
	public String toSting() {
		 return "This Aircraft has a price of "+this.price+" $ and has a maximum elevation of "+this.maxElevation+" m";
	 }
	 public boolean equals(Aircraft a) {
		 return (this.maxElevation==a.maxElevation&&this.price==a.price);
	 }

}
