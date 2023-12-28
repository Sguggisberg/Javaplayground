package ch.stg.java8.arrow.interfaces.predicate.example1;

import java.util.function.Predicate;

public class PredicateExample1 {

	static Predicate<Integer> p1 = (i) -> i % 2 == 0;
	static Predicate<Integer> p2 = (i) -> i % 5 == 0;

	public static void main(String[] args) {
		System.out.println(p1.test(4));
		System.out.println(p2.test(5));
		System.out.println(p1.and(p2).test(10));
		System.out.println(p1.and(p2).test(11));
		System.out.println(p1.or(p2).test(10));
	}
}
