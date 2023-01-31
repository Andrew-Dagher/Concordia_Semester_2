package labs;

public class BankAccount {
	
	 protected String accountName;
	 protected double balance;
	 protected double transactionFee;

	 
	 @Override
	public String toString() {
		return "accountName=" + accountName + ", balance=" + balance + ", transactionFee=" + transactionFee;
	}
	
	 public void Withdraw(double amount){
		if (this.balance < amount) {
			System.out.println("not enough funds");
		}else this.balance=this.balance-amount;
	}
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
