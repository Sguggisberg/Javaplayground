package ch.stg.java8.interfaces.binary.operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Example1 {

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(3, 4));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Max: " + maxBy.apply(4,5));
    }
}
