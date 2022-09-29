/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Ex1 {

    public static void main(String[] args) {
        Predicate<Animal> isPet = Pet.class::isInstance;
        Predicate<Animal> isWild = isPet.negate();

        List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"),
                new Fish("Free Willy"), new Spider(), new Fish("Jaws"));

        List<Animal> wilds = animals.stream()
                .filter(isWild)
                .collect(Collectors.toList());
        
        animals.stream()
                .map(Object::getClass)
                .map(Class::getName)
                .distinct()
                .forEach(System.out::println);
//Ex2
        animals.stream()
                .filter(isPet)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        
        
    }

}
