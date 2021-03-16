package bank2;

public class Testagregation2 {
	public static void main(String[] args) {
		Account aAccount = new Account();
		aAccount.holder = new Client();
		aAccount.holder.name = "Feijãp";
		
		System.out.println("Holder's name: "+aAccount.holder.name);
	}

}