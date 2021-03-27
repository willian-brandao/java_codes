
public class AccountBonus {
	
	public static final String System = null;
	private double totalValueSalaryBonnus;

	public void accountingBonus( Employee e) {
		double bonus = e.getSalaryBonus();
		this.totalValueSalaryBonnus += bonus;
	}
	
	public double getTotalValueSalaryBonnus() {
		return this.totalValueSalaryBonnus;
	}
}
