// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 *  Metro is a Train that in addition it has the following: total number of stops (int type)which indicates the total number of stations between, and including, the starting and destination stations.
 *  the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 *  @author Kevin Shibu Chacko
 *  @author Andrew Harissi Dagher
 *  
 */
package Assignments.assignment2.Metro;

import Assignments.assignment2.Train_Tram.Train;

public class Metro extends Train {
	   /** the total number of stops of metro*/
	   protected int totalStops;
	   /**
	    * public constructor
	    *Creates a new instance of the metro class with the number of wheels, maximum speed, and number of vehicles initialized to zero, and the starting and destination station names set to null and sets total stops to 0
	    */
	   public Metro() {
		   super();
		   this.totalStops=0;
	   }
	   /**
	    * custom constructor
	    * Creates a new Metro object with the specified attribute values.
	    * @param wheels  the number of wheels of this metro
	    * @param speed the maximum speed of this metro (in km/h)
	    * @param vehicles the number of vehicles of this metro
	    * @param start the name of the starting station of this metro
	    * @param dest  the name of the destination station of this metro
	    * @param stops the total number of stops of this metro
	    */
	   public Metro(int wheels,double speed,int vehicles,String start, String dest, int stops) {
		   super(wheels,speed,vehicles,start,dest);
		   this.totalStops=stops;
	   }
	   /**
	    * Creates a new Metro object that is a copy of the specified Metro object.
	    * @param m other the Metro object to copy
	    */
	   public Metro(Metro m) {
		   this.numWheels=m.numWheels;
		   this.maxSpeed=m.maxSpeed;
		   this.numVehicles=m.numVehicles;
		   this.startStation=m.startStation;
		   this.Destination=m.Destination;
		   this.totalStops=m.totalStops;
	   }
	   /**
	    * Returns the total number of stops of this metro.
	    * @return the total number of stops of this metro
	    */
	   public int gettotalStops() {
		   return this.totalStops;
	   }
	   /**
	    * Sets the total number of stops of this metro to the specified value.
	    * @param stops  the new total number of stops of this metro
	    */
	   protected void settotalStops(int stops) {
		   this.totalStops=stops;
	   }
	   /**
	    * Returns a string representation of this metro object.
	    * @return a string representation of this metro object
	    */
	   public String toString() {
			 return "This Metro has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr. It has "+this.numVehicles+" vehicles and its starting and destination stations are "+this.startStation+" and "+this.Destination+".It has "+this.totalStops+" total stops.";
		 }
	   /**
	    * Compares this metro object to the specified object for equality.
	    * @param m the object to compare to this metro object
	    * @return  true if and only if the specified object is a metro object with same attributes
	    */
		 public boolean equals(Object a) {
			 if(a==null||a.getClass()!=this.getClass())
				 return false;
			 else {
				 Metro m=(Metro)a;
				 return (this.numWheels==m.numWheels&&this.maxSpeed==m.maxSpeed&&this.numVehicles==m.numVehicles&&this.startStation.equals(m.startStation)&&this.Destination.equals(m.Destination)&& this.totalStops==m.totalStops);
			 }
			 
		 }
	}