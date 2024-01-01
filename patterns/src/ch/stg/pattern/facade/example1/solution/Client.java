package ch.stg.pattern.facade.example1.solution;

import ch.stg.pattern.facade.example1.solution.email.EmailFacade;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade emailFacade = new EmailFacade();
		boolean result = emailFacade.sendOrderEmail(order);

		System.out.println("Order Email " + (result ? "sent!" : "NOT sent..."));
	}
}
