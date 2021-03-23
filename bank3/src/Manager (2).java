
public class Manager extends Employee{
	
	private int password;
	
	//accessor's methods 
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	//Behavior
	public boolean certifyPassword(int password) {
		if (this.password == password)
			return true;
		return false;
	}
	//rewrite
	public double getSalaryBonus() {
		//employee's bonus + 40% of salary
		return (super.getSalaryBonus()) + (super.getSalary() * 0.4);
	}
}
