package Assignments.assignment2.Aircraft_WorldWar;

public class WWII_Airplane extends Aircraft{
	
	boolean twinEngine;
	
	WWII_Airplane(){
		twinEngine=false;
	}
	WWII_Airplane(double price, double maxElevation, boolean engine){
		super(price,maxElevation);
		this.twinEngine=engine;
	}
	WWII_Airplane(WWII_Airplane w){
		this.twinEngine=w.twinEngine;
	}
	public String toSting() {
		if(this.twinEngine==true) {
		 return "This World War II Airplane has a price of" +super.price+ "$, has a maximum elevation of "+super.maxElevation+" m and has a twin Engine";
	 }
		else
			 return "This World War II Airplane has a price of" +super.price+ "$, has a maximum elevation of "+super.maxElevation+" m and does not have a twin Engine";
	}
	 public boolean equals(WWII_Airplane a) {
		 return (this.twinEngine==a.twinEngine);
	 }

}