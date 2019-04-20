package lab08date0409;

public class Circle extends Shape {
	protected double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*getRadius()*getRadius();
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*getRadius();
	}
	
	public String toString() {
		String s = super.toString();
		return "A Circle with radius = " + getRadius() + ", which is a subclass of "+s;
	}

}
