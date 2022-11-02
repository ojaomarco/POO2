
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Corrida {

	public static void main(String[] args) throws InterruptedException {
		
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro(1));
		carros.add(new Carro(2));
		carros.add(new Carro(3));
		
		List<Thread> threads = new ArrayList<>();
		threads.add(new Thread(carros.get(0)));
		threads.add(new Thread(carros.get(1)));
		threads.add(new Thread(carros.get(2)));

	
		threads.stream().forEach(Thread::start);	
		threads.stream().forEach(t -> {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});	
		
		carros.stream()
			.min(Comparator.comparing(Carro::getTempo))
			.ifPresent((n)->System.out.println("O ganhador foi: "+ n.getId()));

	}

}
