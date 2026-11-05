package geometry;

public class Test {

	public static void main(String[] args) {
//		VEZBE 3
		int broj = 20;
		System.out.println(broj);
		Point p1 = new Point(); 
		System.out.println(p1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p1.isSelected());
		
		p1.setX(100);
		System.out.println(p1.getX());
		
		Point p2 = new Point();

		System.out.println(p2.getX());
		p2 = p1;
		System.out.println(p2.getX());
		p2.setY(20);
		System.out.println(p1.getY());
		System.out.println(p2.getY());
		
		Line l1 = new Line();
		l1.setStartPoint(p2);
		l1.setEndPoint(new Point());
		l1.setSelected(true);
		
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
		System.out.println(l1.isSelected());
		
		System.out.println(l1.getStartPoint().getX());
		
		System.out.println("Duzina linije l1 je:" + l1.Lenght());
		
	}

}