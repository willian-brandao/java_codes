
public class TestOverload {
	
	public static void main(String[] args) {
		Manager aManager = new Manager();
		aManager.setName("Gustavo Heringer");
		aManager.setPassword(123);
		
		if(aManager.certify(45))
			System.out.println("access released");
		else
			System.out.println("access denied");
		
		
		System.out.println("Name: "+aManager.getName());
		System.out.println("Salary: "+aManager.getSalary());
		System.out.println("Bonus Salary: "+aManager.getSalaryBonus());
		
	}
}
