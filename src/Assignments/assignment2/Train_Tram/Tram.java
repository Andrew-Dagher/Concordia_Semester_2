package Assignments.assignment2.Train_Tram;

import Assignments.assignment2.Metro.Metro;

public class Tram extends Metro {
	
	int yearCreation;
	   
	  public Tram(){
		  super();
		  this.yearCreation=0;
	  }
	  public Tram(int wheels,double speed,int vehicles, String station,String destination,int stops,int creation){
		  super(wheels,speed,vehicles,station,destination,stops);
		  this.yearCreation=creation;
	  }
	  public Tram(Tram tr){
		  this.numWheels=tr.numWheels;
		  this.maxSpeed=tr.maxSpeed;
		  this.numVehicles=tr.numVehicles;
		  this.startStation=tr.startStation;
		  this.Destination=tr.Destination;
		  this.totalStops=tr.totalStops;
		  this.yearCreation=tr.yearCreation;
	  }
	  public int getyearCreation() {
		  return this.yearCreation;
	  }
	  protected void setyearCreation(int creation) {
		  this.yearCreation=creation;
	  }
	  public String toString() {
			 return "This Tram has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr. It has "+this.numVehicles+" vehicles and its starting and destination stations are "+this.startStation+" and "+this.Destination+".It has "+this.totalStops+" total stops and the year of creation is "+this.yearCreation;
		 }
		 public boolean equals(Tram tr) {
			 return (this.numWheels==tr.numWheels&&this.maxSpeed==tr.maxSpeed&&this.numVehicles==tr.numVehicles&&this.startStation.equals(tr.startStation)&&this.Destination.equals(tr.Destination)&& this.totalStops==tr.totalStops&&this.yearCreation==tr.yearCreation);
		 }
	}
