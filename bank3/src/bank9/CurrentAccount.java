package bank9;

public class CurrentAccount  extends Account {

	//constructors are not inherit
	
	public CurrentAccount( int id) {
		super(id);
		
	}
	@Override
	public boolean withdraw( double value) {
		return super.withdraw((value + 0.5));
	}
}
