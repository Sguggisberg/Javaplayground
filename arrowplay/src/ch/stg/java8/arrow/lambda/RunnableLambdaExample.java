package ch.stg.java8.arrow.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable1");
			}
		};
		new Thread(runnable1).start();

		// Java 8 lambda
		Runnable runnable2 = () -> {
			System.out.println("Runnable2");
		};
		new Thread(runnable2).start();

		Runnable runnable3 = () -> System.out.println("Runnable3");
		new Thread(runnable3).start();

		new Thread(() -> System.out.println("Runnable4")).start();

	}

}
