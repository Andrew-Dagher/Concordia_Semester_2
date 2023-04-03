// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * Represents a wheeled transportation with a certain number of wheels and a maximum speed which extnends the parent class. 
 * the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 * It contains an integer variable to store the number of wheels and a double variable to store the maximum speed.
 * @author Kevin Shibu Chacko
 * @author Andrew Harissi Dagher
 */
package Assignments.assignment2.WheeledTransportation;

import Assignments.assignment2.Parent;

public class WheeledTransportation extends Parent {
	/** The number of wheels of this transportation. */
	protected int numWheels;
	/** The maximum speed of this transportation. */
	protected double maxSpeed;
	
	/**
	 * Default constructor.Creates a new instance of the WheeledTransportation class with the number of wheels and
	 * the maximum speed initialized to zero.
	*/
	 public WheeledTransportation() {
		 this.numWheels=0;
		 this.maxSpeed=0;
	}
	 /**
		Custom Constructor.Constructs a new WheeledTransportation object with the given number of wheels and maximum speed.
		@param wheels the number of wheels for this transportation
		@param maxSpeed the maximum speed for this transportation
		*/
	 public WheeledTransportation(int wheels,double maxspeed){
		 this.numWheels=wheels;
		 this.maxSpeed=maxspeed;
	 }
	 /**
	  * Custom Constructor.Creates a new instance of the WheeledTransportation class by copying the attributes of the
	  * provided wheeled transportation object.
	  * @param wt the other wheeled transportation object
	  */
	 public WheeledTransportation(WheeledTransportation wt){
		 this.numWheels=wt.numWheels;
		 this.maxSpeed=wt.maxSpeed;
	 }
	 /**
	  * Returns the number of wheels of this wheeled transportation.
	  * @return the number of wheels of this wheeled transportation
	  */
	 public int getnumWheels() {
		 return this.numWheels;
	 }
	 /**
	  * Sets the number of wheels of this wheeled transportation to the specified value.
	  * @param wheels the new number of wheels of this wheeled transportation
	  */
	 protected void setnumWheels(int wheels) {
		 this.numWheels=wheels; 
	 }
	 /**
	  * Returns the maximum speed of this wheeled transportation.
	  * @return the maximum speed of this wheeled transportation
	  */
	 public double getmaxSpeed() {
		 return this.maxSpeed;
	 }
	 /**
	  * Sets the maximum speed of this wheeled transportation to the specified value.
	  * @param speed the new maximum speed of this wheeled transportation
	  */
	 protected void setmaxSpeed(double speed) {
		 this.maxSpeed=speed; 
	 }
	 /**
	  * Returns a string representation of this wheeled transportation, including the number of wheels and the maximum speed.
	  * @return a string representation of this wheeled transportation
	  */
	 public String toString() {
		 return "This Wheeled Transportation has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr.";
	 }
	 /**
	  * Compares Wheeled Transportation object with other object
	  * @param w other wheeled transportation object
	  * @return true if they have same attributes
	  */
	 public boolean equals(Object a) {
		 if(a==null||a.getClass()!=this.getClass())
			 return false;
		 else {
			 WheeledTransportation w=(WheeledTransportation) a;
		 return (this.numWheels==w.numWheels&&this.maxSpeed==w.maxSpeed);
		 }
	 }
	 
	 
	 
	 

}