

public class Account {
	//attributes
	private Client holder;// get (immutable)
	private int id; // get (immutable)
	private double balance; //get
	
	//Constructor
	
	
	/*public Account() {
		this.balance=500;
		this.holder = new Client();
		System.out.println("Constructing/Instacing a account...");
	}*/
	
	public Account(int id) {
		this.balance=500;
		this.holder = new Client();
		this.id = id;
		if( this.id >= 0)
			this.id = id;
		else {
			System.out.println("Account's Id invalid");
			return;
		}
		System.out.println("Constructing/Instacing a account...");
	}
	
	//Accessor methods
	public double getBalance() {
		return this.balance;
	}
	public double getId() {
		return this.id;
	}
	
	public Client getHolder() {
		return this.holder;
	}
	
	//behaviors
	public boolean withdraw(double value){
		if( this.balance < value) 
			return false;
		else {
			//this is reference for who's summon up the method
			this.balance -= value;
			return true;
		}
		
	}
	
	public boolean deposit( double value) {
		if( value <= 0)
			return false;
		else {
			this.balance += value;
			return true;
		}
	}
	
	public boolean transfer( double value, Account destinationAccount) {
		if( this.balance < value )
			return false;
		else {
			//this is account source
			this.balance -= value;
			return destinationAccount.deposit(value);
		}
	}
	
	public void showData() {
		System.out.println("Account's Id: "+this.getId());
		System.out.println("Account's Balance: "+this.balance);
		System.out.println("Holder's information: ");
		this.holder.showData();
	}
}
