

public class Client {
	private String name;
	private String cpf;
	private String email;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
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
	
	
}
