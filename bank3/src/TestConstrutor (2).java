

public class TestConstrutor {
	public static void main(String[] args) {
		
		//a account needs to born in a consistent status( id and minimum balance;)
		Account aAccount = new Account(56,"Feijão");
		aAccount.deposit(100);
		aAccount.withdraw(100);
		aAccount.showData();
		
		System.out.println("*****************************************");
		Account account1 = new Account(567, "Arroz");
		account1.showData();
	}

}