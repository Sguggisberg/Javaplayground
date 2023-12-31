package ch.stg.pattern.principle.liskov.substitution.example1.solution;

public class Square implements Shape {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}

}
