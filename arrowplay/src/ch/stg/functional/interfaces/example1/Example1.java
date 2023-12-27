package ch.stg.functional.interfaces.example1;

import java.util.function.Function;

public class Example1 {
    static Function<String, String> function = (name) -> name.toUpperCase();

    public static void main(String[] args) {
        System.out.println("Text: " + function.apply("Java8"));
    }

}
