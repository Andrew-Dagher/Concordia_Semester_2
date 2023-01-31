package labs;

public class DriverClassBank {

	public static void main(String[] args) {
		
		BankAccount[] Bank = new BankAccount[3];
		

		
		
		SavingAccount S1 = new SavingAccount();
		SavingAccount S2 = new SavingAccount();
		CheckingAccount C1 = new CheckingAccount();
		
		S1.balance = 100.0;
		S2.balance = 20.0;
		
		C1.balance= 50;
		
		Bank[0] = S1;
		Bank[1] = S2;
		Bank[2] = C1;
		
		for (int i= 0 ; i<3;i++) {
			for(int j= 0; j<3;j++) {
				Bank[j].Withdraw(15);
			}
		}
		
		for (int i= 0 ; i<3;i++) {
			System.out.println(Bank[i].toString());
			System.out.println(" ");
			}
	
		
	}

}
