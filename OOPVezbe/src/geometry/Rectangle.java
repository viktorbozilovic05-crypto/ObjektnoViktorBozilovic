package geometry;

public class Rectangle {
	private Point upperLeft;
	private int width, height;
	private boolean selected;
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeifht() {
		return height;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public int area(int width, int height) {
		int P;
		P = width * height;
		
		return P;
	}
	
	public int circumference(int width, int height) {
		int O;
		O = 2 * width + 2 * height;
		
		return O;
	}
	
	
}
