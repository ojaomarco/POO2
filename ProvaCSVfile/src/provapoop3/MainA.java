/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provapoop3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author joau
 */
public class MainA {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader("LFT_2022.csv"));
        try {
            while(in.ready()){
                String linha = in.readLine();
                System.out.println(linha);
                
            }
        } catch (IOException ex) {
        }
        
    }
    
}
