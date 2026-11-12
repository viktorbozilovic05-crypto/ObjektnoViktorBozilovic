package geometry;

public class Circle {
	
	private int radius;
	private Point center;
	private boolean selected;
	
	public Circle() {
		
	}
	
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	public Circle(int radius, Point center, boolean selected) {
		this(radius, center);
		this.selected = selected;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void setUpperLeft(int radius) {
		this.radius = radius;
	}

	public double circleArea (int radius) {
		double P;
		P = Math.pow(radius, 2) * Math.PI;
		
		return P;
	}
	
	public double circleO (int radius) {
		double O;
		O = 2 * radius * Math.PI;
		
		return O;
	}
}
