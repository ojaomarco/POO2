/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author aluno
 */
public class Threads extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Threads teste = new Threads();

        teste.start();

    }
    
    public void run(){
        System.out.println("João");
    }
}
