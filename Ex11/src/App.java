import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Multiplos> lista = new ArrayList<>();
        lista.add(new Multiplos(3));
        lista.add(new Multiplos(4));
        lista.add(new Multiplos(7));
        lista.add(new Multiplos(9));
        lista.add(new Multiplos(11));




        ArrayList <Thread> threads = new ArrayList<>();
        threads.add(new Thread(lista.get(0)));
        threads.add(new Thread(lista.get(1)));
        threads.add(new Thread(lista.get(2)));
        threads.add(new Thread(lista.get(3)));
        threads.add(new Thread(lista.get(4)));

        threads.stream().forEach(Thread::start);
        threads.stream().forEach(t -> {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});	
        
        System.out.println(lista.stream()
                                .mapToLong(x -> x.getSoma())
                                .sum());
       

    }
}
