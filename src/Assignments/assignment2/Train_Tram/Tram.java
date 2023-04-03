// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * A Tram is a Metro that in addition has the following: year of creation (int type), which indicates the year the tram was created.
 * the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 * @author Kevin Shibu Chacko
 * @author Andrew Harissi Dagher
 */
package Assignments.assignment2.Train_Tram;

import Assignments.assignment2.Metro.Metro;

public class Tram extends Metro {
	/** the trams year of creation*/
	protected int yearCreation;
	  /**
	   * default constructor
	   * *Creates a new instance of the metro class with the number of wheels, maximum speed, and number of vehicles initialized to zero, and the starting and destination station names set to null and sets total stops to 0 as well as set year of creation to 0
	   */
	  public Tram(){
		  super();
		  this.yearCreation=0;
	  }
	  /**
	   * Creates a new Tram object with the specified attribute values.
	   * @param wheels the number of wheels of this tram
	   * @param speed the maximum speed of this tram (in km/h)
	   * @param vehicles the number of vehicles of this tram
	   * @param station the name of the starting station of this tram
	   * @param destination the name of the destination station of this tram
	   * @param stops the total number of stops of this tram
	   * @param creation the year of creation of this tram
	   */
	  public Tram(int wheels,double speed,int vehicles, String station,String destination,int stops,int creation){
		  super(wheels,speed,vehicles,station,destination,stops);
		  this.yearCreation=creation;
	  }
	  /**
	   * Creates a new Tram object that is a copy of the specified Tram object.
	   * @param tr other the Tram object to copy
	   */
	  public Tram(Tram tr){
		  this.numWheels=tr.numWheels;
		  this.maxSpeed=tr.maxSpeed;
		  this.numVehicles=tr.numVehicles;
		  this.startStation=tr.startStation;
		  this.Destination=tr.Destination;
		  this.totalStops=tr.totalStops;
		  this.yearCreation=tr.yearCreation;
	  }
	  /**
	   * Returns the year of creation of this tram.
	   * @return the year of creation of this tram
	   */
	  public int getyearCreation() {
		  return this.yearCreation;
	  }
	  /**
	   *Sets the year of creation of this tram to the specified value.
	   * @param creation the new year of creation of this tram
	   */
	  protected void setyearCreation(int creation) {
		  this.yearCreation=creation;
	  }
	  /**
	   * Returns a string representation of this tram object.
	   * @return a string representation of this tram object
	   */
	  public String toString() {
			 return "This Tram has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr. It has "+this.numVehicles+" vehicles and its starting and destination stations are "+this.startStation+" and "+this.Destination+".It has "+this.totalStops+" total stops and the year of creation is "+this.yearCreation;
		 }
	  /**
	   * Compares this tram object to the specified object for equality.
	   * @param tr the object to compare to this tram object
	   * @return true if and only if the specified object is a tram object with the same attributes
	   */
		 public boolean equals(Object a) {
			 if(a==null||a.getClass()!=this.getClass())
				 return false;
			 else {
				 Tram tr=(Tram)a;
			 return (this.numWheels==tr.numWheels&&this.maxSpeed==tr.maxSpeed&&this.numVehicles==tr.numVehicles&&this.startStation.equals(tr.startStation)&&this.Destination.equals(tr.Destination)&& this.totalStops==tr.totalStops&&this.yearCreation==tr.yearCreation);
			 }
		 }
	}