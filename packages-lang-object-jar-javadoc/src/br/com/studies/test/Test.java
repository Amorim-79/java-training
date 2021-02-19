package br.com.studies.test;

import br.com.studies.object.MyObject;

/**
 * Classe para testar os imports de outros packages e testes gerais do projeto
 * 
 * @author PedrooH
 * */
public class Test {
	public static void main(String[] args) {
		MyObject object = new MyObject();
		
		System.out.println(object.getUser());
		
		// String e System fazem parte do java.lang, biblioteca padrão e necessária para todo projeto java (importada automaticamente)
	}
}
