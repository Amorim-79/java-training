
public class variables {
	public static void main(String[] args) {
		// Declarando os tipo de variaveis
		
		boolean booleano = false; // Armazena booleanos (false || true)
		
		short tipoShort = 5; // Armazena números de -32,768 até 32,767
		
		byte tipoByte = 52; // Armazena números de -128 até 127
		
		int numero = 1; // Armazena números inteiros de até 32bits
		
		long numeroGrande = 955252L; // Semelhante ao int porém armazena até 64bits
		
		float pi = 3.14f; // Armazena números fracionários. Suficiente para armazenar 6 a 7 dígitos decimais 
		
		double salario = 2500.50; // Armazena números fracionários. Suficiente para armazenar 15 dígitos decimais
		
		char letra = 'A'; // Armazena apenas um caracterer ou valores ASCII
		
		String frase = "Eu sou uma String"; // Armazena um conjunto de chars, formando palavras
		
		System.out.println(numero);
		System.out.println(numeroGrande);
		System.out.println(pi);
		System.out.println(salario);
		System.out.println(booleano);
		System.out.println(letra);
		System.out.println(frase);
		System.out.println(tipoByte);
		System.out.println(tipoShort);
		
		// Convertendo variaveis
		
		int doubleToInt = (int) salario;
		float doubleToFloat = (float) salario;
		
		System.out.println(doubleToInt);
		System.out.println(doubleToFloat);
	}
}
