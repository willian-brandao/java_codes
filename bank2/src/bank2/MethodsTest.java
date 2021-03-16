package bank2;

public class MethodsTest {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.holder = "Charlie";
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
		account2.holder = "Lily";
		account2.id = 345;
		account2.balance = 8776.34;
		
		account1.transfer(2500, account2);
		System.out.println("Holder: "+account1.holder);
		System.out.println("Id account: "+account1.id);
		System.out.println("Balance: "+account1.balance);
		System.out.println("#####################################");
		System.out.println("Holder: "+account2.holder);
		System.out.println("Id account: "+account2.id);
		System.out.println("Balance: "+account2.balance);
		
	}
}
