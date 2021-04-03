

public abstract class Account {
	//attributes
	private Client holder; // get(immutable)
	private int id; // get (immutable)
	protected double balance; //get
	
	//static attribute 
	private static int TotalAccount = 0;
	
	//Constructor
	public static int GetTotalAccount() { return Account.TotalAccount;}
	
	public Account(int id) {
		Account.TotalAccount++;
		this.balance = 500;
		this.holder = new Client();
		
		this.id = id;
		if( this.id >= 0)
			this.id = id;
		else {
			System.out.println("Account's Id invalid");
			return;
		}
	}
//	public Account(int id, String Holdername) {
//		Account.TotalAccount++;
//		this.balance = 500;
//		this.holder =  new Client(Holdername);
//		
//		this.id = id;
//		if(this.id >= 0)
//			this.id = id;
//		else {
//			System.out.println("Account's Id invalid");
//			return;
//		}
//	}
	
	//acessors methods
	public double getBalance() { return this.balance;}
	public double getId() { return this.id;}
	public Client getHolder() { return this.holder;}
	
	//behavior
	public boolean withdraw(double value){
		if(this.balance < value ) 
			return false;
		else{
			//this is reference for who summon up the method
			this.balance -= value;
			return true;
		}
	}
	
	public boolean deposit(double value) {
		if( value <= 0)
			return false;
		else {
			this.balance += value;
			return true;
		}
	}
	public boolean transfer( double value, Account accountDestination) {
		if(this.withdraw(value)==false)
			return false;
		else {
			//this is reference to account source
			//this.balance += value;
			return accountDestination.deposit(value);		}
	}
	
	
	public void showData() {
		System.out.println("Account's Id: "+this.getId());
		System.out.println("Account's Balance "+this.balance);
		System.out.println("Holder's information ");
		this.holder.showData();
	}
	
}