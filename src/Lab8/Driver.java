package Lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Driver {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Employer emp1 = new Employer();
        Employer emp2 = new Employer();
        Employer emp3 = new Employer();
        Employer emp4 = new Employer();
        Employer emp5 = new Employer();
        Employer emp6 = new Employer();
        Employer emp7 = new Employer();
        Employer emp8 = new Employer();
        Employer emp9 = new Employer();
        Employer emp10 = new Employer();

     
        // write objects to binary file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employers.bin"));
        out.writeObject(emp1);
        out.writeObject(emp2);
        out.writeObject(emp3);
        out.writeObject(emp4);
        out.writeObject(emp5);
        out.writeObject(emp6);
        out.writeObject(emp7);
        out.writeObject(emp8);
        out.writeObject(emp9);
        out.writeObject(emp10);
        out.close();

        // change salaries of the first 3 employers
        emp1.setSalary(1200);
        emp2.setSalary(2200);
        emp3.setSalary(3200);

        // read objects from binary file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employers.bin"));

        // create an empty list of employers
        Employer[] employers = new Employer[10];

        //fill the array with the original objects from binary
        for (int i = 0; i < 10; i++) {
            employers[i] = (Employer) in.readObject();
        }

        // close the input stream
        in.close();

        // print the original list of employers
        System.out.println("Original list of employers:");
        for (Employer emp : employers) {
            System.out.println(emp.toString());
        }

       
        // write the updated list of employers to the binary file
        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("employers.bin"));
        for (Employer emp : employers) {
            out2.writeObject(emp);
        }
        out2.close();

        // read the updated list of employers from the binary file
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("employers.bin"));

        // create a new list of employers to hold the updated data
        Employer[] updatedEmployers = new Employer[10];

        for (int i = 0; i < 10; i++) {
            updatedEmployers[i] = (Employer) in2.readObject();
        }

        // close the input stream
        in2.close();

        // print the updated list of employers
        System.out.println("\n\nUpdated list of employers:");
        for (Employer emp : updatedEmployers) {
            System.out.println(emp.toString());
        }
        
    }
}
