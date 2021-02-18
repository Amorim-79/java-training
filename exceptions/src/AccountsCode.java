
public enum AccountsCode {
	
	SAVING("13"),CURRENT("01");
	
	private String value;
	
	AccountsCode(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
