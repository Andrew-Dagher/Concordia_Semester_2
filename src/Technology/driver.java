package Technology;

import java.util.ArrayList;
import InnovationLab.Employee;

public class driver {
	
	public static void main(String[] args) {
		
	
	Employee Emp = new Employee();
	SoftwareDeveloper D = new SoftwareDeveloper();
	DevOps DO = new DevOps();
	
	ArrayList<Employee> array = new ArrayList<Employee>(); 
	
	array.set(0, D);
	array.set(1, DO);
	array.add(Emp);
	
	
	}
}