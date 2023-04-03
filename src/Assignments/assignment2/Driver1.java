/**
 * Kevin Shibu Chacko 40241154
 * Andrew Harissi Dagher 40247726
 * COMP249
 * Assignment #2
 *  Due Date: March 3 2023
 * Driver Class to create multiple objects and test if findLeastAndMostExpensiveAircraft method works
 */
package Assignments.assignment2;

import Assignments.assignment2.Aircraft_WorldWar.Aircraft;
import Assignments.assignment2.Aircraft_WorldWar.WWII_Airplane;
import Assignments.assignment2.Ferry.Ferry;
import Assignments.assignment2.Metro.Metro;
import Assignments.assignment2.Monowheel.Monowheel;
import Assignments.assignment2.Train_Tram.Train;
import Assignments.assignment2.Train_Tram.Tram;
import Assignments.assignment2.WheeledTransportation.WheeledTransportation;

public class Driver1 {
	/**
	 * Finds the least and most expensive Aircraft object from an array of Parent objects. 	
	 * @param objects the array of Parent objects
	 */
	public static void findLeastAndMostExpensiveAircraft(Parent[] objects) {
	    Aircraft leastExpensive = null;
	    Aircraft mostExpensive = null;
	    boolean are_there_aircrafts = false;

	    for (int i = 0;i<objects.length;i++) {
	        if (objects[i] instanceof Aircraft) {
	            Aircraft aircraft = (Aircraft) objects[i];

	            if (leastExpensive == null || aircraft.getprice() < leastExpensive.getprice()) {
	                leastExpensive = aircraft;
	            }

	            if (mostExpensive == null || aircraft.getprice() > mostExpensive.getprice()) {
	                mostExpensive = aircraft;
	            }

	            are_there_aircrafts = true;
	        }
	    }

	    if (are_there_aircrafts) {
	        System.out.println("Least Expensive Aircraft: " + leastExpensive);
	        System.out.println("Most Expensive Aircraft: " + mostExpensive);
	    } else {
	        System.out.println("No Aircrafts are present in the array of objects.");
	    }
	}


	public static void main(String[] args) {
		
		//creating objects:
		WheeledTransportation W1 = new WheeledTransportation();
		WheeledTransportation W2 = new WheeledTransportation(12,50.00);//wheels,speed
		
		Train train1 = new Train();
		Train train2 = new Train(22,100.00,2,"Montreal","Ottowa");//wheels, speed, num of vehicle, from, to
		Train train3 = new Train(train2);
		Train train4 = new Train(100,200.00,2,"NYC","Chicago");
		Train train5 = new Train(1000,20,1000,"Vancouver","Texas");
		Train train6 = new Train(22,100.00,2,"Saskatchewan","Toronto");
		Train train7 = new Train(22,100.00,2,"Montreal","NYC");
		Train train8 = new Train(22,100.00,2,"Ohio","Arizona");
		Train train9 = new Train(22,100.00,2,"Las Vegas","Los Angeles");
		
		Metro metro = new Metro();
		
		
		Tram tram1 = new  Tram(6,30,1, "West of Montreal","Downtown Montreal",5,2023);//wheels, speed, num of vehicle, from, to, stops, year
		Tram tram2 = new Tram(tram1);
		
		Monowheel mono = new Monowheel(1,20.00,220); //wheels,speed,weight supported 
		
		Ferry ferry1 = new Ferry(10.50,1000); //speed, load
		Ferry ferry2 = new Ferry(20.00,500);
		Ferry ferry3 = new Ferry(30.00,700);
		Ferry ferry4 = new Ferry(40.00,1200);
		
		Aircraft plane1 = new Aircraft(12000,10000); //price , max elevation
		Aircraft plane2 = new Aircraft(plane1);
		Aircraft plane3 = new Aircraft(100000,20000);
		Aircraft plane4 = new Aircraft(12000,5000);
		Aircraft plane5 = new Aircraft(2000,3000);
		
		WWII_Airplane Wplane1 = new WWII_Airplane(120000,3000,false); //price , max elevation, double engined
		WWII_Airplane Wplane2 = new WWII_Airplane(200000, 5000, true);
		
		//using the toString method on the objects:
		System.out.println(W1.toString());
		System.out.println(W2.toString());
		
		System.out.println();
		
		System.out.println(train1.toString());
		System.out.println(train2.toString());
		System.out.println(train3.toString());
		System.out.println(train4.toString());
		System.out.println(train5.toString());
		System.out.println(train6.toString());
		System.out.println(train7.toString());
		System.out.println(train8.toString());
		System.out.println(train9.toString());
		
		System.out.println();
		
		System.out.println(metro.toString());
		
		System.out.println();
		
		System.out.println(tram1.toString());
		System.out.println(tram2.toString());
		
		System.out.println();
		
		System.out.println(mono.toString());
		
		System.out.println();
		
		System.out.println(ferry1.toString());
		System.out.println(ferry2.toString());
		System.out.println(ferry3.toString());
		System.out.println(ferry4.toString());
		
		System.out.println();
		
		System.out.println(plane1.toString());
		System.out.println(plane2.toString());
		System.out.println(plane3.toString());
		System.out.println(plane4.toString());
		System.out.println(plane5.toString());
		
		System.out.println();
		
		System.out.println(Wplane1.toString());
		System.out.println(Wplane2.toString());
		
		System.out.println();
		
		System.out.println("Is train 1 and train 2 equal: " + train1.equals(train2));
		System.out.println("Is plane 1 and plane 2 equal: " + plane1.equals(plane2));
		System.out.println("Is plane 1 and the War plane 1 equal: " + plane1.equals(Wplane1));
		System.out.println("Is ferry and plane 1 equal: " + ferry1.equals(plane1));
		
		System.out.println();
		
		Parent[] array1 = new Parent[] {plane1,train1,tram1,ferry1,ferry3,plane5,Wplane1,mono,W1,metro,plane2,plane3,train2,train5,train7,train3};
		Parent[] array2 = new Parent[] {train1,train2,train3,ferry1,ferry3,train8,W1,mono,tram1,W2,metro,train9,train4,train5,train7};
		
		findLeastAndMostExpensiveAircraft(array1);
		System.out.println();
		findLeastAndMostExpensiveAircraft(array2);
	}

}