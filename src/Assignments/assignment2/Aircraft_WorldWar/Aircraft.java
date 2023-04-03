// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * Represents an Aircraft with a price and maximum elevation and extends the parent class.
 * the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 */

package Assignments.assignment2.Aircraft_WorldWar;

import Assignments.assignment2.Parent;

public class Aircraft extends Parent {
	private double price;
	private double maxElevation;
	/**
	 * Default constructor for the Aircraft class.initaializes price and elevation to 0
	 */
	public Aircraft(){
		this.price=0;
		this.maxElevation=0;
	}
	/**
	 * custom constructor
	 * @param price The price of the aircraft.
	 * @param elevation The maximum elevation of the aircraft.
	 */
	public Aircraft(double price,double elevation){
		this.price=price;
		this.maxElevation=elevation;
	}
	/**
	 * Copy constructor for the Aircraft class.
	 * @param a The Aircraft object to be copied.
	 */
	public Aircraft(Aircraft a){
		this.price=a.price;
		this.maxElevation=a.maxElevation;
	}
	/**
	 * Returns the price of the aircraft.
	 * @return The price of the aircraft.
	 */
	public double getprice() {
		return this.price;
	}
	/**
	 * Returns the maximum elevation of the aircraft.
	 * @return The maximum elevation of the aircraft.
	 */
	public double getmaxElevation() {
		return this.maxElevation;
	}
	/**
	 * Sets the price of the aircraft.
	 * @param price  The price of the aircraft.
	 */
	protected void setprice(double price) {
		this.price=price;
	}
	/**
	 * Sets the maximum elevation of the aircraft.
	 * @param elevation The maximum elevation of the aircraft.
	 */
	protected void setmaxElevation(double elevation) {
		this.maxElevation=elevation;
	}
	/**
	 * Returns a string representation of the Aircraft object.
	 * @return A string representation of the Aircraft object.
	 */
	public String toString() {
		 return "This Aircraft has a price of "+this.price+" $ and has a maximum elevation of "+this.maxElevation+" m";
	 }
	/**
	 * Determines if this Aircraft object is equal to another object.
	 * @param a The object to compare to this Aircraft object.
	 * @return True if the objects are equal, false otherwise.
	 */
	public boolean equals(Object a) {
		if(a==null||a.getClass()!=this.getClass())
			 return false;
		 else {
			 Aircraft air=(Aircraft)a;
			 return (this.price==air.price&&this.maxElevation==air.maxElevation);
		 }
	}
		 

}