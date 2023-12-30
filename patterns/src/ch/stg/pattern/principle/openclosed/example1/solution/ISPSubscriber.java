package ch.stg.pattern.principle.openclosed.example1.solution;

import java.util.List;

//open for modification
public class ISPSubscriber extends Subscriber {
	private long freeUsage;

	@Override
	public double calculateBill() {
		List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
		long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
		long chargeableData = totalData - freeUsage;
		return chargeableData * baseRate / 100;
	}

}