package ch.stg.java8.arrow.lambda;

import java.util.Comparator;

public class ComparatorLamdaExample {
	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Vergleiche: " + comparator.compare(3, 2));

		Comparator<Integer> comparatorLamda = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};

		System.out.println("Vergleiche: " + comparatorLamda.compare(3, 2));

		Comparator<Integer> comparatorLamda2 = (a, b) -> {
			return a.compareTo(b);
		};

		System.out.println("Vergleiche: " + comparatorLamda2.compare(3, 2));

	}
}
