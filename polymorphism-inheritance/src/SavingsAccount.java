
public class SavingsAccount extends Account {

	private int code = 13;
	
	public SavingsAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public int getCode() {
		return this.code;
	}
}
