/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 *
 * @author aluno
 */
public class Ex4 {
    public static void main(String[] args) {
//        System.out.println(new SecureRandom().nextInt(10));
////      Stream.generate(lambda expression) lambda Infinita
//        Stream.generate(()->"asdas").forEach(System.out::println);
//
//        IntStream.generate(()->new SecureRandom().nextInt(10000))
//                .forEach(System.out::println);

        Supplier<Animal> a1 = ()->new Cat();
        Supplier<Animal> a2 = ()->new Fish();
        Supplier<Animal> a3 = ()->new Spider();

        List<Supplier<Animal>>supliers=Arrays.asList(a1,a2,a3);

        
        IntStream.generate(()->new SecureRandom().nextInt(supliers.size()))
                .mapToObj(supliers::get)
                .map(Supplier::get)
                .map(Animal::getLegs)
                .limit(100)
                .collect(Collectors.toList())
                .forEach((n)->System.out.println(n.getClass().getName()));
       


        

    }

    

}
