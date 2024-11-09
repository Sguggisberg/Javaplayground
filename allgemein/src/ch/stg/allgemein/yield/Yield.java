package ch.stg.allgemein.yield;
@SuppressWarnings("all")
// Java 13
public class Yield {

	public enum Number {
		ONE, TWO, THREE, FOUR;
	}

	// Before Java 13
	public static void main(String[] args) {
		Number number = Number.TWO;

		String message;
		switch (number) {
		case ONE:
			message = "Got a 1";
			break;
		case TWO:
			message = "Got a 2";
			break;
		default:
			message = "More than 2";
		}
		System.out.println(message);

		// Java 13
		message = switch (number) {
		case ONE -> "Got a 1";

		case TWO -> {
			{
				System.out.println("Some logs....");
				yield "Got a 2";
			}
		}
		case THREE, FOUR -> "More than 2";

		};
		System.out.println(message);
	}

}
