package br.com.studies.object;

/**
 * Classe que utiliza um Object(toda classe é um Object) para testes
 * 
 * @author PedrooH
 * */
public class MyObject {
	private UserTest ownerObject = new UserTest("Tester", "561565");
	
	/**
	 * Retorna o Usuário proprietário do Object
	 * */
	public Object getUser() {
		return this.ownerObject.getName();
	}
	
}
