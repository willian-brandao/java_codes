

public class Treasurer extends Employee{
	
	@Override
	public double getSalaryBonus() {
		return super.salary * 0.2;
	}
}
