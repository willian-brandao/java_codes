
public class BankTeller extends Employee{
	
	private int ticketNumber;

	public int getTicketNumber() {
		return this.ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	@Override
	public double getSalaryBonus() {
		return this.salary * 0.15;
	}
}