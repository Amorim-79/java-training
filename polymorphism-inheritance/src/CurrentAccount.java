
public class CurrentAccount extends Account implements Taxable {
	
	String code = AccountsCode.CURRENT.getValue();
	
	public CurrentAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public String getCode() {
		return this.code;
	}
	
	@Override
	public boolean withdraw(double value) {
		double fee = 0.10;
		return super.withdraw(value + fee);
	}

	@Override
	public double getTaxValue() {
		return super.getBalance() * 0.01;
	}
}
