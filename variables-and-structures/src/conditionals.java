
public class conditionals {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar!");
		}
		
		char option = 'N';
		
		switch (option) {
			case 'S':
				System.out.println("Você escolheu SIM");
				break;
			default:
				System.out.println("Você escolheu NÃO");
				break;
		}
	}
}
