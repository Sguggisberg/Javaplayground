package ch.stg.java8.interfaces.example1;

import java.util.function.Function;

public class Example1 {
    private static Function<String, String> function = (name) -> name.toUpperCase();
    private static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result: " + function.apply("Java8"));
        System.out.println("Result of andthen is: " + function.andThen(addSomeString).apply("Java8"));
        System.out.println("Result of andthen is: " + function.compose(addSomeString).apply("Java8"));
    }

}
