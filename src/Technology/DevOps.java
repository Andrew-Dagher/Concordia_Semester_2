package Technology;

import InnovationLab.Employee;

public class DevOps extends Employee {
	
	SoftwareDeveloper D1 = new SoftwareDeveloper();
	public DevOps() {
		this.Salary=D1.getSalary()-(0.2*D1.getSalary());
		this.ESOP=D1.getESOP()-(0.02*D1.getESOP());
		this.Skills= super.Skills+"AWS";
	}
	
	

}
