package Assignments.assignment2;

import Assignments.assignment2.Aircraft_WorldWar.Aircraft;

public class Driver {
		
	public static void findLeastAndMostExpensiveAircraft(Object[] objects) {
	    Aircraft leastExpensive = null;
	    Aircraft mostExpensive = null;
	    boolean hasAircrafts = false;

	    for (int i = 0;i<objects.length;i++) {
	        if (objects[i] instanceof Aircraft) {
	            Aircraft aircraft = (Aircraft) objects[i];

	            if (leastExpensive == null || aircraft.getprice() < leastExpensive.getprice()) {
	                leastExpensive = aircraft;
	            }

	            if (mostExpensive == null || aircraft.getprice() > mostExpensive.getprice()) {
	                mostExpensive = aircraft;
	            }

	            hasAircrafts = true;
	        }
	    }

	    if (hasAircrafts) {
	        System.out.println("Least Expensive Aircraft: " + leastExpensive);
	        System.out.println("Most Expensive Aircraft: " + mostExpensive);
	    } else {
	        System.out.println("No Aircrafts are present in the array of objects.");
	    }
	}


	public static void main(String[] args) {
		

	}

}
