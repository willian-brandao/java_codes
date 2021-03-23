
public class TestEmployee {
	
	public static void main(String[] args) {
		Manager aManager = new Manager();
		aManager.setName("Gustavo Heringer");
		aManager.setSalary(3000);
		
		Employee attendant = new Employee();
		attendant.setName("Gilberto Faisão");
		attendant.setSalary(1000);
		
		
		System.out.println("Name: "+aManager.getName());
		System.out.println("Salary: "+aManager.getSalary());
		System.out.println("Bonus Salary: "+aManager.getSalaryBonus());
		System.out.println();
		System.out.println("Name: "+attendant.getName());
		System.out.println("Salary: "+attendant.getSalary());
		System.out.println("Bonus Salary: "+attendant.getSalaryBonus());
	}
}
