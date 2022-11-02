public class ThreadInteference {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println("Count: "+counter.value());
        Thread t1 = new Thread(new App(counter));
        Thread t2 = new Thread(new App(counter));
        Thread t3 = new Thread(new App(counter));

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("Count: "+counter.value());
    }
}
