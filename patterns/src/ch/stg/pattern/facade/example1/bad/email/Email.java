package ch.stg.pattern.facade.example1.bad.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
