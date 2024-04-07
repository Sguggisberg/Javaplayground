package ch.stg.generic.method.example1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
			Pair<String, Double> test = new Pair<>("Test", 2.33);
	}

	private static <T> T firstOrElse(List<T> list, T defaultValue) {
		if (list == null || list.isEmpty()) {
			return defaultValue;
		}
		return list.get(0);
	}

	private static class Pair<T, U> {
		public final T first;
		public final U second;

		public Pair(T first, U second) {
			this.first = first;
			this.second = second;
		}

	}

}
