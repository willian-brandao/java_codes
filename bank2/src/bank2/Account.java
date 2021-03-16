package bank2;

public class Account {
	//attributes
	Client holder = new Client(); //Client holder; 
	int id;
	double balance = 500;
	
	//behaviors
	public boolean withdraw(double value){
		if( balance < value) 
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
