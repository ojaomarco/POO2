package threads;

import javax.print.attribute.standard.RequestingUserName;

public class RunnableTest implements Runnable {
    public static void main(String[] args) {
        RunnableTest test = new RunnableTest();
        Thread thread = new Thread(test);

        thread.start();
    }

    @Override
    public void run() {
        System.out.println("oiiiii");
    }
}
