package exercicios;

import java.nio.file.attribute.AclFileAttributeView;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"),
        new Fish("Free Willy"), new Spider(), new Fish("Jaws"));

        animals.stream()
        .collect(Collectors.groupingBy(Animal::getLegs,Collectors.counting()))
       
        .forEach((a,b)->System.out.println(a+": "+b));
         //aasdasd
    }
}
