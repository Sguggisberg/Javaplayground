package ch.stg.pattern.facade.example1.solution.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
