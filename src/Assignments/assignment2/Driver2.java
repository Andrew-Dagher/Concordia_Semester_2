// -----------------------------------------------------
// Assignment 2
// Part: 2
// Written by: Kevin Shibu Chacko 40241154, Andrew Harissi Dagher 40247726
// -----------------------------------------------------
/**
 * Driver 2 class to create multiple objects and test if copyTheObjects method works
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

public class Driver2 { //basically need to input array, make a new array of same size and copy array one into the new array using copy constructor.
	 
	/**
	 * This method takes an array of Parent objects as a parameter and returns a new array of the same size that contains the same elements as the input array
	 * The method initializes an empty array of the same size as the input array and iterates through each element in the input array, copying it into the new array.
	 * The method checks the type of each element in the input array and creates a new object of that type in the copied array.
	 * If an object in the input array cannot be copied, the corresponding element in the copied array is set to null.
	 * The method returns the copied array.
	 * @param objects an array of Parent objects to be copied
	 * @return an array of Parent objects that is a copy of the input array
	 * @throws error when it does not find the right object type
	 */
	 public static Parent[] copyTheObjects(Parent[] objects) {
		
		 Parent[] copiedObjects = new Parent[objects.length];// creating an empty array of same size as parameter to then fill it up.
		
		 
		 int index = 0;
		 int counter = 0;
		 while(true) {
			 
			 
			 
			 try {
				 Parent object = objects[index];
				 
				 if (index + 1 == objects.length) {
					 return copiedObjects;
					 //returns the copied array.
				 }
				 if(counter == 0) {
					 copiedObjects[index] = new WheeledTransportation((WheeledTransportation)object);
					 
					 if(!object.equals(copiedObjects[index])) {
						 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
						 throw new Exception();
					 }
					 index++;
					 counter=0;
					 continue;
				 }
				 if(counter == 1) {
					 copiedObjects[index] = new Train((Train)object);
					 if(!object.equals(copiedObjects[index])) {
						 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
						 throw new Exception();
					 }
					 index++;
					 counter=0;
					 continue;
				 }
				 
				 if(counter == 2) {
					 copiedObjects[index] = new Metro((Metro)object);
					 if(!object.equals(copiedObjects[index])) {
						 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
						 throw new Exception();
					 }
					 index++;
					 counter=0;
					 continue;
				 }
				 
				 if(counter == 3) {
					 copiedObjects[index]= new Tram((Tram)object);
					 if(!object.equals(copiedObjects[index])) {
						 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
						 throw new Exception();
					 }
					 index++;
					 counter=0;
					 continue;
				 }
				 
				 if(counter == 4) {
					 copiedObjects[index]= new Monowheel((Monowheel)object);
					 if(!object.equals(copiedObjects[index])) {
						 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
						 throw new Exception();
					 }
					 index++;
					 counter=0;
					 continue;
				 }
				 
				 if(counter == 5) {
					 copiedObjects[index]= new Ferry((Ferry)object);
					 if(!object.equals(copiedObjects[index])) {
					 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
					 throw new Exception();
				 }
				 index++;
				 counter=0;
				 continue;
				 }
				 
				 if(counter == 6) {
					 copiedObjects[index]= new Aircraft((Aircraft)object);
					 
					 if(!object.equals(copiedObjects[index])) {
					 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
					 throw new Exception();
				 }
				 index++;
				 counter=0;
				 continue;
				 }
				 
				 if(counter == 7) {
					 copiedObjects[index]= new WWII_Airplane((WWII_Airplane)object);
					 if(!object.equals(copiedObjects[index])) {
					 copiedObjects[index] = null; // if object array does not match the copied one, then make the copied element at index be null.
					 throw new Exception();
				 }
				 index++;
				 counter=0;
				 continue;
				 }	
				 if(counter == 8) {
					 return copiedObjects;
					 
				 }
			 }
			 
			 
			 catch (Exception e) {
				 System.out.println("error at index: " + index);
				 System.out.println(objects[index].getClass());
				 counter++;
				 System.out.println("counter is now at: "+counter);
				 System.out.println();
				 continue;
				 
			 }
		 }
		 
	 }

	public static void main(String[] args) {
		
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
		
		Parent[] array1 = new Parent[] {plane1,train1,tram1,ferry1,ferry3,plane5,Wplane1,mono,W1,metro,plane2,plane3,train2,train5,train7,train3};
		
		Parent[] array2 = copyTheObjects(array1);
		
		for(int i = 0; i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		System.out.println();
		for(int i = 0; i<array2.length;i++) {
			System.out.println(array2[i]);
		}
	
		
		
		
		
	}

}