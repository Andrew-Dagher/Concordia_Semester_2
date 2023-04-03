// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * Represents a train with a certain number of wheels, a maximum speed, a number of vehicles
 * This class extends the WheeledTransportation class and adds two additional attributes: the number of vehicles and the names of the starting and destination stations.
 *  the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 * @author Kevin Shibu Chacko
 * @author Andrew Harissi Dagher
 * 
 */
package Assignments.assignment2.Train_Tram;

import Assignments.assignment2.WheeledTransportation.WheeledTransportation;

public class Train  extends WheeledTransportation{
	/** The number of vehicles of this train. */
	protected  int numVehicles;
	/** The name of the starting station of this train. */
	protected  String startStation;
	/** The name of the destination station of this train. */
	protected  String Destination;
    /**
     * default constructor
     * Creates a new instance of the Train class with the number of wheels, maximum speed, and number of vehicles initialized to zero, and the starting and destination station names set to null.
     */
	public Train() {
		super();
		this.numVehicles=0;
		this.startStation=null;
		this.Destination=null;

	}
	/**
	 * custom constructor
	 * Creates a new instance of the Train class with the specified number of wheels, maximum speed, number of vehicles, starting station name, and destination station name.
	 * @param wheels numWheels the number of wheels of the new train
	 * @param maxspeed the maximum speed of the new train
	 * @param vehicles the number of vehicles of the new train
	 * @param start  the name of the starting station of the new train
	 * @param destination the name of the destination station of the new train
	 */
	public Train(int wheels,double maxspeed,int vehicles,String start,String destination) {
		super(wheels,maxspeed);
		this.numVehicles=vehicles;
		this.startStation=start;
		this.Destination=destination;
	}
	/**
	 * copy constructor
	 * Creates a new instance of the Train class by copying the attributes of the provided train object.
	 * @param t other the train object to copy
	 */
	public Train(Train t) {
	this.numWheels=t.numWheels;
	this.maxSpeed=t.maxSpeed;
	this.numVehicles=t.numVehicles;
	this.startStation=t.startStation;
	this.Destination=t.Destination;
	}
	/**
	 * Returns the number of vehicles of this train.
	 * @return the number of vehicles of this train
	 */
	public int getnumVehicles() {
		return this.numVehicles;
	}
	/**
	 * Returns the name of the starting station of this train.
	 * @return the name of the starting station of this train
	 */
	public String getstartStation() {
		return this.startStation;
	}
	/**
	 * Returns the name of the destination station of this train.
	 * @return the name of the destination station of this train
	 */
	public String getDestination() {
		return this.Destination;
	}
	/**
	 * Sets the number of vehicles of this train to the specified value.
	 * @param vehicles the new number of vehicles of this train
	 */
	protected void setnumVehicles(int vehicles) {
		this.numVehicles=vehicles;
	}
	/**
	 * Sets the name of the starting station of this train to the specified value.
	 * @param station the new name of the starting station of this train
	 */
	protected void setstartStation(String station) {
		this.startStation=station;
	}
	/**
	 * Sets the name of the destination station of this train to the specified value.
	 * @param destination destStation the new name of the destination station of this train
	 */
	protected void setDestination(String destination) {
		this.Destination=destination;
	}
	/**
	 * Returns a string representation of this train object.
	 * @return a string representation of this train object
	 */
	public String toString() {
		 return "This Train has "+ this.getnumWheels()+" wheels, has a maximum speed of "+this.getmaxSpeed()+" km/hr. It has "+this.numVehicles+" vehicles and its starting and destination stations are "+this.startStation+" and "+this.Destination;
	 }
	/**
	 * Compares this train object to the specified object for equality.
	 * @param t the object to compare to this train object
	 * @return true if and only if the specified object is a train object with the same attributes
	 */
	 public boolean equals(Object a) {
		 if(a==null||a.getClass()!=this.getClass())
		 return false;
	 else {
		 Train t=(Train)a;
		return(this.getnumWheels()==t.getnumWheels() && this.getmaxSpeed()==t.getmaxSpeed() && this.getnumVehicles()== t.numVehicles && this.startStation.equals(t.startStation) && this.Destination.equals(t.Destination));
	 }
	 }
	 
	
	
}