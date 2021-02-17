
public class SavingsAccount extends Account {

	String code = AccountsCode.SAVING.getValue();
	
	public SavingsAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public String getCode() {
		return this.code;
	}
}
