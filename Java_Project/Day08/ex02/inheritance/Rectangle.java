package ex02.inheritance;

public class Rectangle extends Point {
	private int x2, y2;

	public Rectangle(int x2, int y2) {
		super(x2,y2);
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rectangle 2개 Constructor call");
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void display() {
		System.out.println(x+", "+y);
	}
	
}
