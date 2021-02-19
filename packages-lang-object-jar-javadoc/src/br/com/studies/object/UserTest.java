package br.com.studies.object;

/**
 * Classe responsável por criar um usuário para teste
 * 
 * @author PedrooH
 * */
public class UserTest {
	private String name;
	private String password;
	
	public UserTest(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
