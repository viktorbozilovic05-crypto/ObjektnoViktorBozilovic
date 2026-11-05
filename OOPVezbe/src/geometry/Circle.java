package geometry;

public class Circle {
	
	private int radius;
	private Point center;
	
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
