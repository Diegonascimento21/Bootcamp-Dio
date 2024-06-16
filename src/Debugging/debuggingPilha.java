package Debugging;

public class debuggingPilha {

	public static void main(String[] args) {
		// Pilha de execução de um projeto java
		// Sempre começa e termina pelo Main
		System.out.println("Iniciou o programa no método main.");
		a();
		System.out.println("Finalizou o programa no método main.");
		
	}
	
	static void a() {
		System.out.println("Entrou no método a.");
		b();
		System.out.println("Finalizou o método a.");

	}
	
	static void b() {
		System.out.println("Entrou no método b.");
		c();
		System.out.println("Finalizou o método b.");

	}
	
	static void c() {
		System.out.println("Entrou no método c.");
		System.out.println("Finalizou o método c.");

	}

}
