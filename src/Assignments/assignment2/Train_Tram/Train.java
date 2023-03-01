package Assignments.assignment2.Train_Tram;

import Assignments.assignment2.WheeledTransportation.WheeledTransportation;

public class Train  extends WheeledTransportation{

	protected int numVehicles;
	protected String startStation;
	protected String Destination;

	public Train() {
		super();
		this.numVehicles=0;
		this.startStation=null;
		this.Destination=null;

	}
	public Train(int wheels,double maxspeed,int vehicles,String start,String destination) {
		super(wheels,maxspeed);
		this.numVehicles=vehicles;
		this.startStation=start;
		this.Destination=destination;
	}
	public Train(Train t) {
	this.numWheels=t.numWheels;
	this.maxSpeed=t.maxSpeed;
	this.numVehicles=t.numVehicles;
	this.startStation=t.startStation;
	this.Destination=t.Destination;
	}
	public int getnumVehicles() {
		return this.numVehicles;
	}
	public String getstartStation() {
		return this.startStation;
	}
	public String getDestination() {
		return this.Destination;
	}
	protected void setnumVehicles(int vehicles) {
		this.numVehicles=vehicles;
	}
	protected void setstartStation(String station) {
		this.startStation=station;
	}
	protected void setDestination(String destination) {
		this.Destination=destination;
	}
	
	public String toString() {
		 return "This Train has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr. It has "+this.numVehicles+" vehicles and its starting and destination stations are "+this.startStation+" and "+this.Destination;
	 }
	 public boolean equals(Train t) {
		 return (this.numWheels==t.numWheels&&this.maxSpeed==t.maxSpeed&&this.numVehicles==t.numVehicles&&this.startStation.equals(t.startStation)&&this.Destination.equals(t.Destination));
	 }
	 
	
	
}
	
