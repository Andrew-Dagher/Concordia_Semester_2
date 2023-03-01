package Assignments.assignment2.WheeledTransportation;

import Assignments.assignment2.Parent;

public class WheeledTransportation extends Parent {

	protected int numWheels;
	protected double maxSpeed;
	
	
	 public WheeledTransportation() {
		 this.numWheels=0;
		 this.maxSpeed=0;
	}
	 public WheeledTransportation(int wheels,double maxspeed){
		 this.numWheels=wheels;
		 this.maxSpeed=maxspeed;
	 }
	 public WheeledTransportation(WheeledTransportation wt){
		 this.numWheels=wt.numWheels;
		 this.maxSpeed=wt.maxSpeed;
	 }
	 public int getnumWheels() {
		 return this.numWheels;
	 }
	 protected void setnumWheels(int wheels) {
		 this.numWheels=wheels; 
	 }
	 public double getmaxSpeed() {
		 return this.maxSpeed;
	 }
	 protected void setmaxSpeed(double speed) {
		 this.maxSpeed=speed; 
	 }
	 public String toString() {
		 return "This Wheeled Transportation has "+ this.numWheels+" wheels, has a maximum speed of "+this.maxSpeed+" km/hr.";
	 }
	 public boolean equals(WheeledTransportation w) {
		 return (this.numWheels==w.numWheels&&this.maxSpeed==w.maxSpeed);
	 }
	 
	 
	 
	 

}
