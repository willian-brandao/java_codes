
public class TestStaticMember {
	
	public static void main(String[] args) {
		Account aAccount = new Account(1);
		aAccount.getHolder().setName("Luizinho");
		aAccount.deposit(1500);
		aAccount.withdraw(500);
		aAccount.showData();
		System.out.println();
		
		Account anotherAccount = new Account(2, "Guilherme");
		anotherAccount.getHolder().setEmail("coxinha@cefet.com");
		anotherAccount.showData();
		
		System.out.println("I have "+Account.GetTotalAccount()+" account(s) in memory.");
	}
}
