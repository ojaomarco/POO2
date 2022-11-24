
package provapoop2;

public class Concorrencia {
	public static void main(String args[]) throws Exception {
		RecursoCompartilhado2 recurso = new RecursoCompartilhado2(1);
           	
		Thread threadA = new Thread(recurso, "Thread A");
		Thread threadB = new Thread(recurso, "Thread B");
		
		threadA.start();
		threadB.start();
		threadA.join();
		threadB.join();
		System.out.println("Programa finalizado.");
	}
}
