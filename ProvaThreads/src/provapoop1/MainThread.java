/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provapoop1;

/**
 *
 * @author joau
 */
public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        Thread tA = new Thread(a);
        Thread tB = new Thread(b);
        
        tA.start();
        tB.start();
        Thread.sleep(30000);
        
        a.stopThread();
        b.stopThread();
               
    }

}
