package ch.stg.pattern.principle.dependency.inversion.example2.solution;

public class Schalter {
	private SchalterClient client;
	private boolean gedrueckt;

	public Schalter(SchalterClient client) {
		this.client = client;
	}

	public void drueckeSchalter() {
		gedrueckt = !gedrueckt;
		if (gedrueckt) {
			client.anschalten();
			System.out.println("Eingeschaltet");

		} else {
			client.ausschalten();
			System.out.println("Ausgeschaltet");
		}
	}
}
