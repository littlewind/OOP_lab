package lab08date0409;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return this.length;
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
		
	@Override
	public void setLength(double length) {
		setSide(length);
	}
	
	@Override
	public void setWidth(double width) {
		setSide(width);
	}
	
	public String toString() {
		String s = super.toString();
		return "A Square with side = " + getSide()
		+ ", which is a subclass of " + s;
	}
	
}
