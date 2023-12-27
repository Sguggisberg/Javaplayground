package ch.stg.java8.interfaces.unary.operator;

import java.util.function.UnaryOperator;

public class Example1 {

    private static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
