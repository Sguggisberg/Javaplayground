package ch.stg.generic.wildcard;

import ch.stg.generic.bounded.Cat;
import ch.stg.generic.bounded.Dog;
import ch.stg.generic.bounded.Animal;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();

        List<Animal> myList = List.of(animal, animal1);
        printList(myList);

        //

        Cat animal2 = new Cat();
        Cat animal3 = new Cat();

        List<Cat> myList2 = List.of(animal2, animal3);

        printList2(myList2);
    }

    private static void printList(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    private static void printList2(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
