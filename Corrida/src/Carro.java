

import java.security.SecureRandom;

import java.time.Instant;

public class Carro implements Runnable {
	private int id;
	private Instant tempo;

	
	public Carro(int id) {
		this.id=id;
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Instant getTempo() {
		return this.tempo;
	}


	public void setTempo(Instant tempo) {
		this.tempo = tempo;
	}


	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			int tempoCor = new SecureRandom().nextInt(501)+500;
			try {
				Thread.sleep(tempoCor);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("O carro "+id+" est� na posi��o: "+i);			
			
		}
		tempo= Instant.now();
		
		System.out.println("O carro "+id+" finalizou em: "+tempo+"ms");
	}
	
}
