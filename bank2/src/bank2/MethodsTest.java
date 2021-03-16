package bank2;

public class MethodsTest {
	public static void main(String[] args) {
		Account account1 = new Account();
		Client aClient1 = new Client();
		aClient1.name = "Bernardo";
		account1.id = 567;
		account1.balance = 8989.00;
		
		boolean morecash = account1.deposit(20000);
		if( morecash == true) {
			System.out.println("Deposit is done!!");
		}
			
		boolean balanceOk = account1.withdraw(10000);
		if(! balanceOk)
			System.out.println("This balance is not enough to complete this operation!");
		
		Account account2 = new Account();
		Client aClient2 = new Client();
		aClient2.name = "Lily";
		account2.id = 345;
		account2.balance = 8776.34;
		
		account1.transfer(2500, account2);
		System.out.println("Holder: "+aClient1.name);
		System.out.println("Id account: "+account1.id);
		System.out.println("Balance: "+account1.balance);
		System.out.println("#####################################");
		System.out.println("Holder: "+aClient2.name);
		System.out.println("Id account: "+account2.id);
		System.out.println("Balance: "+account2.balance);
		
	}
}
