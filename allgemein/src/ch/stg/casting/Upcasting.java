package ch.stg.casting;

import ch.stg.generic.bounded.Animal;
import ch.stg.generic.bounded.Cat;

public class Upcasting {
    public static void main(String[] args) {

        // Typ of animal (Reference typ)
        Animal animal = new Cat();

        animal.makeNoise();
    }
}
