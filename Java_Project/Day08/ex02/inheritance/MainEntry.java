package ex02.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		/*Circle c = new Circle();
		 * c.display();
		 * 
		 * new Circle(1,2,3).display();
		 */
		
		Rectangle r = new Rectangle(10, 20);
		r.display();
		
		Point p = new Point(1,2);
		System.out.println(p);
	}
}
