package labs;

public class CheckingAccount extends BankAccount{

	protected int nbFreeTransaction = 2;
	protected int nbTransationMade = 0;
	
	public void Withdraw(double amount){
		super.transactionFee = 2;
		if (nbFreeTransaction <0) {
			if (super.balance < amount) {
				System.out.println("not enough funds");
			}else super.balance=super.balance-amount-super.transactionFee;
		}
		else
			{if (super.balance < amount+super.transactionFee) {
				System.out.println("not enough funds");
			}else super.balance=super.balance-amount-super.transactionFee;
		}
		nbTransationMade++;
		}

	@Override
	public String toString() {
		return "nbFreeTransaction=" + nbFreeTransaction + ", nbTransationMade=" + nbTransationMade
				+ ", accountName=" + accountName + ", balance=" + balance + ", transactionFee=" + transactionFee;
	}
	
	
	
	
	
}
