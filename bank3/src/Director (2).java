
public class Director extends Manager {
	
	@Override
	public double getSalaryBonus(){
		return super.salary * 0.5;
	}
}
