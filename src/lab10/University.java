package lab10;

public class University implements Comparison{

	private int Academic_Reputation;
	private double Industry_income;
	
	public University(){
		
	}
	
	public University(int AC,double IND) {
		this.Academic_Reputation = AC;
		this.Industry_income = IND;
	}
	
	
	public int getAcademic_Reputation() {
		return Academic_Reputation;
	}

	public void setAcademic_Reputation(int academic_Reputation) {
		Academic_Reputation = academic_Reputation;
	}

	public double getIndustry_income() {
		return Industry_income;
	}

	public void setIndustry_income(double industry_income) {
		Industry_income = industry_income;
	}

	
	@Override
	public boolean Top_rank(Object b) {
		University U = (University)b;
		if (U.getAcademic_Reputation()>this.getAcademic_Reputation()) {
			return true;
		}
		else return false;
		
		
	}

	@Override
	public boolean Low_rank(Object b) {
		University U = (University)b;
		if (U.getIndustry_income()<this.getIndustry_income()) {
			return true;
		}
		else return false;
		
	
	}
	
	
	
	
	
	
	

}
