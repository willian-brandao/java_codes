

public class TestConstrutor {
	public static void main(String[] args) {
		
		//a account needs to born in a consistent status( id and minimum balance;)
		Account aAccount = new Account(56);
		aAccount.getHolder().setName("Feij�o");
		aAccount.deposit(100);
		aAccount.withdraw(100);
		
		aAccount.showData();
	}

}