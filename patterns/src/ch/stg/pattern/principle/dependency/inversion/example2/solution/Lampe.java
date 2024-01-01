package ch.stg.pattern.principle.dependency.inversion.example2.solution;

public class Lampe implements SchalterClient {
	private boolean leuchtet;

	public void anschalten() {
		leuchtet = true;
	}

	public void ausschalten() {
		leuchtet = false;
	}
}
