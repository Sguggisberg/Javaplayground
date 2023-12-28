package ch.stg.java8.arrow.interfaces.consumer.example1;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("java8");
	}

}
