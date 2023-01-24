package labs;

public class Employee {
	
	
	//attributes
	private double AnnualSalary;
	private String name; 
	
	
	//constructors
	public Employee(){
		
	}
	
	public Employee(double money, String n) {
		this.AnnualSalary = money;
		this.name = n;	
	}

	public Employee(Employee args){
		this.name = args.name;
		this.AnnualSalary=args.AnnualSalary;
		
	}
	
	
	//getters and setters
	public double getAnnualSalary() {
		return AnnualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		AnnualSalary = annualSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Methods
	public double TaxCalculator(Employee object) {
		double tax=0.0;
		if (object.AnnualSalary <= 75000) {
			tax = 0.10 * object.AnnualSalary+175;
		}
		else tax = 0.15 * object.AnnualSalary+275;
		
		
		return tax;
	}
	
	public boolean equals(Employee obj) {
		if (this.AnnualSalary == obj.AnnualSalary) {
			return true;
		} else return false;
		
	}
	
	public String toString(Employee obj) {
		return "Employee with name "+ obj.name +" and annual salary of "+obj.AnnualSalary+"$ has to pay "+TaxCalculator(obj)+"$ tax each year!";
	}
	
	public static Employee LowestTax (Employee[] objs) {
		double small;
		Employee obj = objs[0];
		
		for (int i = 1; i< objs.length;i++) {
			small = objs[0].getAnnualSalary();
			
			if (objs[i].getAnnualSalary()<objs[i-1].getAnnualSalary()) {
				small = objs[i].getAnnualSalary();
			}
			if (objs[i].getAnnualSalary()==small) {
				obj = objs[i];
			}
			
		}
		
		
		return obj;
	}
	
	public static void main (String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(75000.0,"John");
		Employee emp3 = new Employee(emp2);
		Employee emp4 = new Employee(5000,"Raphael");
		
		emp1.setAnnualSalary(222222.1);
		emp1.setName("hello");
		System.out.println(emp1.getAnnualSalary()+ " "+emp1.getAnnualSalary());
		
		System.out.println(emp2.getName());
		System.out.println(emp4.toString());
		
		
		System.out.println(emp2.equals(emp3));
		
		
		
	}
	
	
	

}


