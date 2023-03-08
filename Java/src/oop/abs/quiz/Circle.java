package oop.abs.quiz;

public class Circle extends Shape {

	int r1, r2;
	
	public Circle(String name) {
		super(name);
	}

	public Circle(String name, int r1, int r2) {
		super(name);
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public double getArea() {
		return r1 * r2 * Math.PI;
	}

}
