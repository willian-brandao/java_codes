

public class Treasurer extends AuthenticatedEmployee{
	
	@Override
	public double getSalaryBonus() {
		return super.salary * 0.2;
	}
}
