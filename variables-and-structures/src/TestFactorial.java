// Nesse exercício opcional, o seu desafio é imprimir os fatoriais de 1 a 10!

public class TestFactorial {
	public static void main(String[] args) {
		int total = 1;
		
		for (int count = 1; count <= 10; count++) {
			total = total * count;
			
			System.out.println(count + "! = " + total);
		}
		
	}
}
