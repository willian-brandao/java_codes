package bank;

public class TestAccount3 {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.holder = "Jack";
		account1.balance = 1200.00;
		account1.id = 34;
		
		Account account2 = new Account();
		account2.holder = "Kate";
		account2.balance = 3456.00;
		account2.id = 56;
		
		Account account3 = new Account();
		
		System.out.println(account1.holder);
		System.out.println(account1.balance);
		System.out.println(account1.id);
		System.out.println("###############################");
		System.out.println(account2.holder);
		System.out.println(account2.balance);
		System.out.println(account2.id);
		System.out.println("###############################");
		System.out.println(account3.holder);
		System.out.println(account3.balance);
		System.out.println(account3.id);		
		
	}
}