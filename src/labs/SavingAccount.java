package labs;

public class SavingAccount extends BankAccount {

	protected int interestRate;
	
	
	public void Withdraw(double amount){
		super.transactionFee = 5;
		
		if (super.balance < amount+super.transactionFee) {
			System.out.println("not enough funds");
		}else super.balance=super.balance-amount-super.transactionFee;
	}
	
	public String toString() {
		return ("accountName=" + accountName + ", balance=" + balance + ", transactionFee=" + transactionFee+ "interest Rate="+ interestRate);
	}
	
	
	
	
	
	
	
}
