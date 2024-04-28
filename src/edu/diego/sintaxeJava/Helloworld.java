package edu.diego.sintaxeJava;

public class Helloworld {

	public static void main(String[] args) {
		
		System.out.println("Olá, Mundo!");
		
		String primeiroNome = "Diego";
		String segundoNome = "Vieira";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //variavel e método
		System.out.print(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) { //Outro metodo - criação de métodos
		
		return primeiroNome.concat(segundoNome);
		
		
	}

}

	