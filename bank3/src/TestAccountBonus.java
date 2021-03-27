
public class TestAccountBonus {
	
	public static void main(String[] args) {
		
		Manager M = new Manager();
		M.setName("Elton");
		M.setSalary(10000);
		
		BankTeller B = new BankTeller();
		B.setName("Jéssica");
		B.setSalary(1000);
		
		Treasurer T  = new Treasurer();
		T.setName("Marcos");
		T.setSalary(5000);
		
		AccountBonus accounting = new AccountBonus();
		accounting.accountingBonus(M);
		accounting.accountingBonus(B);
		accounting.accountingBonus(T);
		
		System.out.println(accounting.getTotalValueSalaryBonnus());
		
		
	}
}
