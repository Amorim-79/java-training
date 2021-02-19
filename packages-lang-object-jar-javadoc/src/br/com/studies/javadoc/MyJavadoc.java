package br.com.studies.javadoc;

/**
 * Classe para teste do javadoc
 * 
 * @author PedrooH
 * */
public class MyJavadoc {
	private int number;
	
	/**
	 * Método para setar o atributo number
	 * 
	 * @param number Número que sera setado no atributo
	 * */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * Método para recuperar o atributo number
	 * */
	public int getNumber() {
		return number;
	}
}
