
public class TestReference {
	public static void main(String[] args) {
		
		Manager ma = new Manager();
		ma.setName("Lurdes");
		System.out.println(ma.getName());
		
		// we can assign reference to object that is less generic
		//all managers are employees
		Employee ma1 = new Manager();
		ma1.setName("Márcio");
		System.out.println(ma1.getName());
		
		//we can't assign reference to object that is more generic
		
		/*Manager ma2 = new Employee();
		ma2.setName("Conceição");
		System.out.println(ma2.getName());*/
	}
}