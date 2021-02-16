
public class CurrentAccount extends Account {
	
	private int code = 1;
	
	public CurrentAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public int getCode() {
		return this.code;
	}
	
	@Override
	public boolean withdraw(double value) {
		double fee = 0.10;
		return super.withdraw(value + fee);
	}
}
