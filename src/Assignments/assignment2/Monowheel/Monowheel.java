// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * This class extends the WheeledTransportation class and adds an additional attribute: max weight;
 * the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 */
package Assignments.assignment2.Monowheel;

import Assignments.assignment2.WheeledTransportation.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
	/** max weight of monowheel*/
	double maxWeight;
   /**
    * public constructor
    * Creates a new Monowheel object with default attribute values: 0 wheel, maximum speed of 0 km/h, and maximum weight set to 0 kg.
    */
   public Monowheel(){
	  super();
	  this.maxWeight=0;   
   }
   /**
    * Creates a new Monowheel object with the specified attribute values.
    * @param wheels the number of wheels of this monowheel 
    * @param speed the maximum speed of this monowheel (in km/h)
    * @param weight the maximum weight this monowheel can support (in kg)
    */
   public Monowheel(int wheels,double speed,int weight){
	   this.numWheels=wheels;
	   this.maxSpeed=speed;
	   this.maxWeight=weight;
	   
   }
   /**
    * Creates a new Monowheel object that is a copy of the specified Monowheel object.
    * @param w other the Monowheel object to copy
    */
   public Monowheel(Monowheel w){
	   this.numWheels=w.numWheels;
	   this.maxSpeed=w.maxSpeed;
	   this.maxWeight=w.maxWeight;
   }
   /**
    * Returns the maximum weight this monowheel can support.
    * @return the maximum weight this monowheel can support
    */
   public double getmaxWeight() {
	   return this.maxWeight;
   }
   /**
    * Sets the maximum weight this monowheel can support to the specified value.
    * @param weight the new maximum weight this monowheel can support
    */
   protected void setmaxWeight(double weight) {
	   this.maxWeight=weight;
   }
   /**
    * Returns a string representation of this monowheel object.
    * @return a string representation of this monowheel object
    */
   public String toString() {
		 return "This Monowheel has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr. It has a maximum weight of "+this.maxWeight;
	 }
   /**
    * Compares this monowheel object to the specified object for equality.
    * @param w the object to compare to this monowheel object
    * @return true if the two objects are equal, false otherwise
    */
	 public boolean equals(Object a) {
		 if(a==null||a.getClass()!=this.getClass())
			 return false;
		 else {
			 Monowheel w=(Monowheel)a;
		 return (this.numWheels==w.numWheels&&this.maxSpeed==w.maxSpeed&&this.maxSpeed==w.maxWeight);
		 }
	 }
}