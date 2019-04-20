package lab08date0409;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return getWidth()*getLength();
	}

	@Override
	public double getPerimeter() {
		return 2*(getWidth()+getLength());
	}
	
	public String toString() {
		String s = super.toString();
		return "A Rectangle with width = " + getWidth()
		+ " and length = " + getLength()
		+ ", which is a subclass of " + s;
	}

}
