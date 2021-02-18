import exceptions.AccountsException;
import exceptions.AccountsExceptionChecked;

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
	public abstract String getCode();
	
	public void deposity(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		if (this.balance < value) {
			throw new AccountsException("Saldo Insuficiente, " + "Saldo: " + this.balance + " Valor solicitado: " + value);
		}
		this.balance -= value;
	}
	
//	// Método com Exception Checked
//	public void withdraw(double value) throws AccountsExceptionChecked {
//		if (this.balance < value) {
//			throw new AccountsExceptionChecked("Saldo Insuficiente, " + "Saldo: " + this.balance + " Valor solicitado: " + value);
//		}
//		this.balance -= value;
//	}
	
	public void transfer(double value, Account destination) {
		this.withdraw(value);
		destination.deposity(value);
	}
	
//	// Método com Exception Checked
//	public void transfer(double value, Account destination) throws AccountsExceptionChecked {
//		this.withdraw(value);
//		destination.deposity(value);
//	}
	
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
