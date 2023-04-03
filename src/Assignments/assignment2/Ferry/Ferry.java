// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * Represents a Ferry with a maximum speed and maximum load and extends the parent class.
 * the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 */
package Assignments.assignment2.Ferry;

import Assignments.assignment2.Parent;

public class Ferry extends Parent{
	
	private double maxSpeed;
	private double maxLoad;
	/**
	 * default constructor, set inital values to 0;
	 */
	public Ferry(){
		this.maxLoad=0;
		this.maxSpeed=0;
	}
	/**
	 * Custrom constructor
	 * @param speed The maximum speed of the ferry.
	 * @param load The maximum load of the ferry.
	 */
	public Ferry(double speed,double load){
		this.maxSpeed=speed;
		this.maxLoad=load;	
	}
	/**
	 * Copy constructor for the Ferry class.
	 * @param f The Ferry object to be copied.
	 */
	public Ferry(Ferry f){
		this.maxSpeed=f.maxSpeed;
		this.maxLoad=f.maxLoad;
	}
	/**
	 * Returns the maximum speed of the ferry.
	 * @return The maximum speed of the ferry.
	 */
	public double getmaxSpeed() {
		return this.maxSpeed;
	}
	/**
	 * Returns the maximum load of the ferry.
	 * @return The maximum load of the ferry.
	 */
	public double getmaxLoad() {
		return this.maxLoad;
	}
	/**
	 * Sets the maximum speed of the ferry.
	 * @param speed The maximum speed of the ferry.
	 */
	protected void setmaxSpeed(double speed) {
		this.maxSpeed=speed;
	}
	/**
	 * Sets the maximum load of the ferry.
	 * @param load The maximum load of the ferry.
	 */
	protected void setmaxLoad(double load) {
		this.maxLoad=load;
	}
	/**
	 * Returns a string representation of the Ferry object. 
	 * @return A string representation of the Ferry object.
	 */
	public String toString() {
		 return "This Ferry has a maximum speed of "+this.maxSpeed+" km/hr and has a maximum load of "+this.maxLoad+" kg";
	 }
	/**
	 * Determines if this Ferry object is equal to another object.
	 * @param f The object to compare to this Ferry object.
	 * @return True if the objects are equal, false otherwise.
	 */
	public boolean equals(Object a) {
		if(a==null||a.getClass()!=this.getClass())
			 return false;
		 else {
			 Ferry f=(Ferry)a;
			 return (this.maxSpeed==f.maxSpeed&&this.maxLoad==f.maxLoad);
		 }
	}
}