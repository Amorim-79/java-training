
public class manageAccount {
	public static void main(String[] args) {
		// Conta 1
		Account account1 = new Account(129, 5438);
		Client client1 = new Client("Pedro Testador", "999.999.999-99");
		
		account1.setOwner(client1);
		
		System.out.println("O saldo da conta 1 é : " + account1.getBalance());
		System.out.println("O titular da conta 1 é: " + account1.getOwner().getName());
		
		// Conta 2
		Account account2 = new Account(129, 2578);
		Client client2 = new Client("Jão Testador", "888.999.989-88");
		
		account2.setOwner(client2);
		
		System.out.println("O saldo da conta 2 é : " + account2.getBalance());
		System.out.println("O titular da conta 2 é: " + account2.getOwner().getName());
		
		account1.deposity(500.45);
		System.out.println("O saldo da conta 1 é : " + account1.getBalance());
		
		boolean statusTransfer =  account1.transfer(120, account2);
		
		if (!statusTransfer) {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("O saldo da conta 1 é : " + account1.getBalance());
		System.out.println("O saldo da conta 2 é : " + account2.getBalance());
		
		System.out.println("O total de contas criadas é : " + Account.getTotal());
		
	}
}
