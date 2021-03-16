

public class Account {
	//attributes
	private Client holder = new Client(); //Client holder; get
	private int id; // getters and setters
	private double balance = 500; //get
	
	//Accessor methods
	public double getBalance() {
		return this.balance;
	}
	public double getId() {
		return this.id;
	}
	public void setId(int Id) {
		//attribute id = argument id
		if( Id < 0)
			return;
		this.id = Id;
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
}
