package ch.stg.pattern;

import ch.stg.pattern.message.JSONMessage;
import ch.stg.pattern.message.Message;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
