package lab10;

public class Journal_paper implements Comparison {

	private double citation;
	private int Impact_Factor;
	
	public Journal_paper(){
		
	}
	
	public Journal_paper(double cit, int imp){
		this.citation = cit;
		this.Impact_Factor = imp;
	}
	
	public double getCitation() {
		return citation;
	}
	public void setCitation(double citation) {
		this.citation = citation;
	}
	public int getImpact_Factor() {
		return Impact_Factor;
	}
	public void setImpact_Factor(int impact_Factor) {
		Impact_Factor = impact_Factor;
	}
	@Override
	public boolean Top_rank(Object b) {
		Journal_paper J = (Journal_paper)b;
		if (J.getImpact_Factor()>this.getImpact_Factor()) {
			return true;
		}
		else return false;
		
		
	}
	@Override
	public boolean Low_rank(Object b) {
		Journal_paper J = (Journal_paper)b;
		if (J.getCitation()<this.getCitation()) {
			return true;
		}
		else return false;
		
	}
	
	
	
	
	
}
