package Assignments.assignment2.Monowheel;

import Assignments.assignment2.WheeledTransportation.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
	double maxWeight;
	
   public Monowheel(){
	  super();
	  this.maxWeight=0;   
   }
   public Monowheel(int wheels,double speed,int weight){
	   this.numWheels=wheels;
	   this.maxSpeed=speed;
	   this.maxWeight=weight;
	   
   }
   public Monowheel(Monowheel w){
	   this.numWheels=w.numWheels;
	   this.maxSpeed=w.maxSpeed;
	   this.maxWeight=w.maxWeight;
   }
   
   public double getmaxWeight() {
	   return this.maxWeight;
   }
   protected void setmaxWeight(double weight) {
	   this.maxWeight=weight;
   }
   public String toString() {
		 return "This Monowheel has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr. It has a maximum weight of "+this.maxWeight;
	 }
	 public boolean equals(Monowheel w) {
		 return (this.numWheels==w.numWheels&&this.maxSpeed==w.maxSpeed&&this.maxSpeed==w.maxWeight);
	 }
}

