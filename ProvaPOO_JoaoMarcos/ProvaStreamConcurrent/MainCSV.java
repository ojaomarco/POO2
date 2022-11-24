/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainCSV {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader("LFT_2022.csv"));
        ArrayList<Cotacao> lista = new ArrayList<>();
        int c = 0;
        try {
            while (in.ready()) {
                String linha = in.readLine();
                String[] arr = linha.split(",");
                if (c > 1) {
                    lista.add(new Cotacao(arr[0],
                            (arr[1].concat(arr[2])),
                            (arr[3].concat(arr[4])),
                            (arr[5].concat(arr[6])),
                            (arr[7].concat(arr[8])),
                            arr[9].concat(arr[10])));
                }
                c++;
            }
        } catch (IOException ex) {

        }
        try {
            FileOutputStream fos = new FileOutputStream("f.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            lista.stream().forEach((b) -> {
                try {
                    ois.writeObject(b);
                    ois.flush();
                    ois.close();
                } catch (IOException ex) {
                }
            });
        } catch (IOException ex) {
        }

    }
}
