
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
	public boolean certify(int password) {
		if (this.password == password)
			return true;
		return false;
	}
	public boolean certify(String login, int password) {
		if (this.password == password && login == "cefet")
			return true;
		return false;
	}
	//rewrite
	public double getSalaryBonus() {
		return this.salary * 0.3;
	}
}
