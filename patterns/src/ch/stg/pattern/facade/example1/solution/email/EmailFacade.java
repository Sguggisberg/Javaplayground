package ch.stg.pattern.facade.example1.solution.email;

import ch.stg.pattern.facade.example1.solution.Order;
import ch.stg.pattern.facade.example1.solution.email.Template.TemplateType;

//Facade provides simple methods for client to use
public class EmailFacade {
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder().withTemplate(template).withStationary(stationary).forObject(order).build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
