package bank9;

public class Employee {
	private String name;
	protected double salary;
	
	//constructor is not a method
	public Employee() {
	}
	//Behavior
	public double getSalaryBonus() {
		return this.salary * 0.1;
	}
	
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
