package bank2;

public class AgregationTest {
	public static void main(String[] args) {
		Account aAccount = new Account();
		Client aClient = new Client();
		aClient.name = "Fernando";
		aAccount.deposit(500);
		aAccount.holder = aClient;
		
		/*
		 * System.out.println(aAccount.holder); 
		 * System.out.println(aClient);
		 */
		System.out.println("Holder: "+aAccount.holder.name);
		System.out.println("Balance: "+aAccount.balance);
	}
}
