/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author aluno
 */
public class Ex3 {
    
    public static void main(String[] args) {
        Predicate<Animal> isPet = Pet.class::isInstance;
        Predicate<Animal> isWild = isPet.negate();

        List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"),
                new Fish("Free Willy"), new Spider(), new Fish("Jaws"));
    
        
        animals.stream()
                .max(Comparator.comparing(Animal::getLegs))              
                .ifPresent(n->System.out.println(n.getClass().getName()));
        
    }
    }
        
    

