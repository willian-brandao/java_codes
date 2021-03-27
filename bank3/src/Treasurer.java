
public class Treasurer extends Employee{
	
	@Override
	public double getSalaryBonus() {
		return this.salary * 0.2;
	}
}
