package bank9;

public class AccountTest {
	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount(1);
		ca.deposit(3000);  
		SavingsAccount sv = new SavingsAccount(2);
		//sv.withdraw(100);//taxa de 0.50
		//ca.withdraw(900);
		
		ca.transfer(100, sv);
		
		System.out.println("Saving Account balance: "+ sv.getBalance());
		System.out.println("Current Account balance: "+ ca.getBalance());
		
	}
}
