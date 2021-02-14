
public class Account {
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
		if (this.balance < value) {
			return false;
		}
		// Realiza o saque da conta atual e logo após o deposito na conta de destino
		this.withdraw(value);
		destination.deposity(value);
		return true;
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
