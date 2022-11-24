/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapoop1;

public class ThreadB implements Runnable {

    boolean ligada;

    public ThreadB() {
        ligada=true;
    }
    
  

    @Override
    public void run() {
        while (ligada) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }
            System.out.println("Ola B");
        }
    }
    
    public void stopThread(){
        ligada=false;
    }
}
