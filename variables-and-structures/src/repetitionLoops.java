
public class repetitionLoops {
	public static void main(String[] args) {
		// While simples
		int countWhile = 0;
		while (countWhile <= 10) {
			System.out.println("Contador do While: " + countWhile);
			countWhile++;
		}
		
		// For simples
		for (int count = 0; count <= 10; count++) {
			System.out.println("For simples, contador do For: " + count);
		}
		
		// For Aninhado
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int number = 1; number <= 10; number++) {
				System.out.println(number + " x " + multiplicador + " = " + number * multiplicador);
			}
			System.out.println();
		}
		
		// For aninhado utilizando break 
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
