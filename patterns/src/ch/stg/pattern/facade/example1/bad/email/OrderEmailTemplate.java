package ch.stg.pattern.facade.example1.bad.email;

public class OrderEmailTemplate extends Template {

	@Override
	public String format(Object obj) {
		return "TEMPLATE";
	}

	
}
