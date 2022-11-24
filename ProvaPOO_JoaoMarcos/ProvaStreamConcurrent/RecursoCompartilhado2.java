package provapoop2;

import java.util.concurrent.atomic.AtomicInteger;

public class RecursoCompartilhado2 implements Runnable {

    private AtomicInteger qtd;

    public RecursoCompartilhado2(int qtd) {
        this.qtd = new AtomicInteger(qtd);
    }

    @Override
    public synchronized void run() {

        if (qtd.get() > 0) {

            System.out.println(Thread.currentThread().getName() + " está executando.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            qtd.decrementAndGet();
            System.out.println(Thread.currentThread().getName() + " consumiu.");
            System.out.println("Saldo: " + qtd.get());
        } else {
            System.out.println(Thread.currentThread().getName() + " ficou sem recurso.");
        }

    }

}
