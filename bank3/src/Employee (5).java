

public abstract class Employee {
	private String name;
	protected double salary;
	
	//constructor is not a method
	public Employee() {
	}
	//Behavior
	
	//we ensured that's other classes that's will implement this method 
	public abstract double getSalaryBonus();
	
	
	//accessor's methods 
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
