
public class InternalSystem {
	private int password = 555;
	
	public void login(AuthenticatedEmployee ae ) {
		if( ae.certify(this.password))
			System.out.println("released");
		else 
			System.out.println("denied");
	}
}
