

public class TestEncapsulation {
	public static void main(String[] args) {
		Account aAccount = new Account();
		aAccount.getHolder().setName("Feijão");
		aAccount.deposit(100);
		aAccount.withdraw(100);
		
		
		
		System.out.println("Holder's name: "+aAccount.getHolder().getName());
		System.out.println("Account's Balance: "+aAccount.getBalance());
		System.out.println("Account's Id: "+aAccount.getId());
	}

}