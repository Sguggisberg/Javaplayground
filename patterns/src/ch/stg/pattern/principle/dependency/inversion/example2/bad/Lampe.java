package ch.stg.pattern.principle.dependency.inversion.example2.bad;

/**
 * Schalter steuert den Ablauf des Verhaltens und benutzt dazu Lampe. Demnach
 * sollte es einem Modul höherer Ebene angehören. Jedoch verletzt das
 * beschriebene Modell das DIP, da Schalter abhängig von Lampe ist. Wird
 * entschieden, dass die Methoden von Lampe umbenannt werden, muss auch Schalter
 * geändert werden. Das grundlegende Problem ist, dass Schalter direkt mit Lampe
 * arbeitet, welches zu einem niedrigeren Modul gehört. Schalter sollte selbst
 * definieren, wie das Objekt aussehen sollte, mit dem es arbeitet.
 * 
 * Wikipedia: https://de.wikipedia.org/wiki/Dependency-Inversion-Prinzip
 * 
 */

public class Lampe {
	private boolean leuchtet;

	public void anschalten() {
		leuchtet = true;
		System.out.println("Eingeschaltet");
	}

	public void ausschalten() {
		leuchtet = false;
		System.out.println("Ausgeschaltet");
	}
}
