package Assignments.assignment2.Metro;

import Assignments.assignment2.Train_Tram.Train;

public class Metro extends Train {
   protected int totalStops;
   
   public Metro() {
	   super();
	   this.totalStops=0;
   }
   public Metro(int wheels,double speed,int vehicles,String start, String dest, int stops) {
	   super(wheels,speed,vehicles,start,dest);
	   this.totalStops=stops;
   }
   public Metro(Metro m) {
	   this.numWheels=m.numWheels;
	   this.maxSpeed=m.maxSpeed;
	   this.numVehicles=m.numVehicles;
	   this.startStation=m.startStation;
	   this.Destination=m.Destination;
	   this.totalStops=m.totalStops;
   }
   public int gettotalStops() {
	   return this.totalStops;
   }
   protected void settotalStops(int stops) {
	   this.totalStops=stops;
   }
   public String toString() {
		 return "This Metro has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr. It has "+this.numVehicles+" vehicles and its starting and destination stations are "+this.startStation+" and "+this.Destination+".It has "+this.totalStops+" total stops.";
	 }
	 public boolean equals(Metro m) {
		 return (this.numWheels==m.numWheels&&this.maxSpeed==m.maxSpeed&&this.numVehicles==m.numVehicles&&this.startStation.equals(m.startStation)&&this.Destination.equals(m.Destination)&& this.totalStops==m.totalStops);
	 }
}
