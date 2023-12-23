package ch.stg.pattern;

import ch.stg.pattern.message.Message;
import ch.stg.pattern.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
