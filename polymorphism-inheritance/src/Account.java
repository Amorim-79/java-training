
public abstract class Account {
	private Client owner;
	private int agency;
	private int number;
	private double balance;
	private static int total;
	
	public Account(int agency, int number) {
		this.agency = agency;
		this.number = number;
		
		Account.total++;
	}
	
	// Métodos abstratos não possui corpo, as classes filhas são obrigadas a implementá-lo
	public abstract int getCode();
	
	public void deposity(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if (this.balance < value) {
			return false;
		}
		this.balance -= value;
		return true;
	}
	
	public boolean transfer(double value, Account destination) {
		if (this.withdraw(value)) {
			destination.deposity(value);
			return true;
		}
		return false;
	}
	
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
	public Client getOwner() {
		return this.owner;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public static int getTotal() {
		return Account.total;
	}
}
