/*
 * O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota.
 * Ele descobriu no site da receita: 
 * De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
 * De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
 * De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
*/

public class TestConditionals {
	public static void main(String[] args) {

		double salario = 4300.0;
		
		boolean aliquota1 = salario >= 1900 && salario <= 2800; // IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
		boolean aliquota2 = salario >= 2800.01 && salario <= 3751; // IR é de 15% e pode deduzir R$ 350
		boolean aliquota3 = salario >= 3751.01 && salario <= 4664; // IR é de 22.5% e pode deduzir R$ 636
		
		if (aliquota1) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else if (aliquota2) {
			System.out.println("O IR é de 15% e pode deduzir R$ 350");
		} else if (aliquota3) {
			System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
		}
	}
}
