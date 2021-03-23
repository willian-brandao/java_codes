

public class Client {
	private String name;
	private String cpf;
	private String email;
	
	public Client() {
		
	}
	public Client(String name, String cpf) {
		//summoning another constructor 
		this(name);
		this.cpf = cpf;
	}
	public Client(String name) {
		if(this.validateName(name))
			this.name = name;
	}
	private boolean validateName(String name) {
		if(name.length() < 6) {
			System.out.println("The field name need to have 8 characters! Try again, please!");
			return false;
		}else
			return true;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(this.validateName(name) == true)
			this.name = name;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(this.validateCpf(cpf) == true)
			this.cpf = cpf;
	}
	
	//encapsuleted method 
	
	private boolean validateCpf(String cpf) {
		if(cpf.length() == 11)
			return true;// early return
		else
			return false;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void showData() {
		System.out.println("Name: "+this.getName());
		System.out.println("Cpf: "+this.cpf);
		System.out.println("Email: "+this.getEmail());
	}
	
	
	
}
