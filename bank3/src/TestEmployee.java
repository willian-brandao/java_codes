
public class TestEmployee {
	
	public static void main(String[] args) {
		Manager aManager = new Manager();
		aManager.setName("Gustavo Heringer");
		aManager.setSalary(3000);
		
		
		System.out.println("Name: "+aManager.getName());
		System.out.println("Salary: "+aManager.getSalary());
		System.out.println("Bonus Salary: "+aManager.getSalaryBonus());
	}
}
