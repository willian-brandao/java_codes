

public class Manager extends AuthenticatedEmployee{
	

	//rewrite
	public double getSalaryBonus() {
		return super.salary * 0.3;
	}
}
