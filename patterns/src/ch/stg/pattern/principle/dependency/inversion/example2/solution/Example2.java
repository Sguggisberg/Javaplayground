package ch.stg.pattern.principle.dependency.inversion.example2.solution;

public class Example2 {

	public static void main(String[] args) {
		Schalter schalter = new Schalter(new Lampe());
		schalter.drueckeSchalter();
		schalter.drueckeSchalter();
	}

}
