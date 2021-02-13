// Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.

public class TestLoop {
	public static void main(String[] args) {
		for (int count = 1; count <= 100; count++) {
			if (count % 3 == 0) {
				System.out.print(count + " ");
			}
		}
		
		System.out.println();
		
		for (int count = 3; count <= 100; count+= 3) {
			System.out.print(count + " ");
		}
	}
}
