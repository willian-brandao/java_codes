
public class TestSystemAccess {
	
	public static void main(String[] args) {
		InternalSystem is = new InternalSystem();
		
		Manager m1 =  new Manager();
		m1.setName("Willian");
		m1.setPassword(555);
		
		Manager m2 = new Manager();
		m2.setName("Elton");
		m2.setPassword(123);
		
		Director d1 = new Director();
		d1.setName("Jéssica");
		d1.setPassword(555);
		
		Treasurer t = new Treasurer();
		t.setName("Gustavo");
		t.setPassword(555);
		
		is.login(m1);
		is.login(m2);
		is.login(d1);
		is.login(t);
	}
	
}
