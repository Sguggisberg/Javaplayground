package ch.stg.pattern.facade.example1.bad;

import ch.stg.pattern.facade.example1.bad.email.Email;
import ch.stg.pattern.facade.example1.bad.email.Mailer;
import ch.stg.pattern.facade.example1.bad.email.Stationary;
import ch.stg.pattern.facade.example1.bad.email.StationaryFactory;
import ch.stg.pattern.facade.example1.bad.email.Template;
import ch.stg.pattern.facade.example1.bad.email.TemplateFactory;
import ch.stg.pattern.facade.example1.bad.email.Template.TemplateType;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		
		boolean result = sendOrderEmailWithoutFacade(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

	private static boolean sendOrderEmailWithoutFacade(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
	
}
