package ch.stg.java8.method.reference;

import java.util.function.Function;

public class Example1 {

    private static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
    private static Function<String, String> toUpperCaseLambda2 = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("Hello"));
        System.out.println(toUpperCaseLambda2.apply("Hello2"));
    }
}
