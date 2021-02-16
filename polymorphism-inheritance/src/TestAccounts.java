
public class TestAccounts {

	public static void main(String[] args) {
		// Instânciando contas
		CurrentAccount cc = new CurrentAccount(484, 8487);
		SavingsAccount sa = new SavingsAccount(854, 5489);
		// Instânciando clientes
		Client tester1 = new Client("Tester 1", "888.888.888-88");
		Client tester2 = new Client("Tester 2", "999.999.999-99");
		
		// Setando os titulares
		cc.setOwner(tester1);
		sa.setOwner(tester2);
		
		//Depositando e transferindo entre as contas
		cc.deposity(500.40);
		cc.transfer(125.40, sa);
		
		// Resultados
		System.out.println("O titular da Conta: " + cc.getCode() + "." + cc.getAgency() + "." + cc.getNumber() + " é: " + cc.getOwner().getName());
		System.out.println("O titular da Conta: " + sa.getCode() + "." + sa.getAgency() + "." + sa.getNumber() + " é: " + sa.getOwner().getName());
		
		System.out.println("O saldo da Conta: " + cc.getCode() + "." + cc.getAgency() + "." + cc.getNumber() + " é: " + cc.getBalance());
		System.out.println("O saldo da Conta: " + sa.getCode() + "." + sa.getAgency() + "." + sa.getNumber() + " é: " + sa.getBalance());
	}
}
