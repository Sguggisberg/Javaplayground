package ch.stg.pattern;

import ch.stg.pattern.message.Message;

public abstract class MessageCreator {

	public Message getMessage() {
		Message message = createMessage();
		message.addDefaultHeaders();
		message.encrypt();
		
		return message;
	}
	
	// Factory method
	public abstract Message createMessage();
}
