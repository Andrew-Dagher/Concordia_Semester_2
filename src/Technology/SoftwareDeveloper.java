package Technology;

import InnovationLab.Employee;

public class SoftwareDeveloper extends Employee{
	
	public SoftwareDeveloper() {
		this.ESOP=super.getESOP()+(super.getESOP()*0.05);
		this.Salary= super.getSalary()+40000;
		this.Skills=super.getSkills()+"SQL";
	}

}
