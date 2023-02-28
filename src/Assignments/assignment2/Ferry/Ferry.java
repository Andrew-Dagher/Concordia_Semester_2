package Assignments.assignment2.Ferry;

import Assignments.assignment2.Parent;

public class Ferry extends Parent{
	
	double maxSpeed;
	double maxLoad;
   
	Ferry(){
		this.maxLoad=0;
		this.maxSpeed=0;
	}
	Ferry(double speed,double load){
		this.maxSpeed=speed;
		this.maxLoad=load;	
	}
	Ferry(Ferry f){
		this.maxSpeed=f.maxSpeed;
		this.maxLoad=f.maxLoad;
	}
	public double getmaxSpeed() {
		return this.maxSpeed;
	}
	public double getmaxLoad() {
		return this.maxLoad;
	}
	protected void setmaxSpeed(double speed) {
		this.maxSpeed=speed;
	}
	protected void setmaxLoad(double load) {
		this.maxLoad=load;
	}
	public String toSting() {
		 return "This Ferry has a maximum speed of "+this.maxSpeed+" km/hr and has a maximum load of "+this.maxLoad+" kg";
	 }
	 public boolean equals(Ferry f) {
		 return (this.maxLoad==f.maxLoad&&this.maxSpeed==f.maxSpeed);
	 }
}
