package ch.stg.pattern.principle.openclosed.example1.solution;

import java.util.List;

// open for modification
public class PhoneSubscriber extends Subscriber {

	@Override
	public double calculateBill() {
		List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
		long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
		return totalDuration * baseRate / 100;
	}

}