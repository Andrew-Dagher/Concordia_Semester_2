// -----------------------------------------------------
// Assignment 2
// Part: 1
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * Represents a WorldWar 2 Aircraft with a price and maximum elevation as well boolean twin engine and extends Aircraft class.
 * the class has a default, custom and copy constructors as well as getters, setters,to string and equals method
 */
package Assignments.assignment2.Aircraft_WorldWar;

public class WWII_Airplane extends Aircraft{
	
	private boolean twinEngine;
	/**
	 * Default constructor
	 */
	public WWII_Airplane(){
		twinEngine=false;
	}
	/**
	 * custom constructor
	 * @param price The price of the airplane.
	 * @param maxElevation The maximum elevation of the airplane.
	 * @param engine Whether or not the airplane has a twin engine.
	 */
	public WWII_Airplane(double price, double maxElevation, boolean engine){
		super(price,maxElevation);
		this.twinEngine=engine;
	}
	/**
	 * Copy constructor
	 * @param w The WorldWarIIAirplane object to be copied.
	 */
	public WWII_Airplane(WWII_Airplane w){
		this.twinEngine=w.twinEngine;
	}
	/**
	 * Returns a string representation of the WorldWarIIAirplane object.
	 * @return  A string representation of the WorldWarIIAirplane object.
	 */
	public String toString() {
		if(this.twinEngine==true) {
		 return "This World War II Airplane has a price of" +super.getprice()+ "$, has a maximum elevation of "+super.getmaxElevation()+" m and has a twin Engine";
	 }
		else
			 return "This World War II Airplane has a price of " +super.getprice()+ "$, has a maximum elevation of "+super.getmaxElevation()+" m and does not have a twin Engine";
	}
	/**
	 * Determines if this WorldWarIIAirplane object is equal to another object.
	 * @param a The object to compare to this WorldWarIIAirplane object.
	 * @return True if the objects are equal, false otherwise.
	 */
	 public boolean equals(Object a) {
		 if(a==null||a.getClass()!=this.getClass())
			 return false;
		 else {
			 WWII_Airplane w =(WWII_Airplane)a;
			 return (this.twinEngine==w.twinEngine);
		 }
		
	 }

}