package ex02.inheritance;

public class Point {
	int x,y;

	public Point() {
		x=y=100;
		System.out.println("Point Default Constructor call");
	}
	
	
	public Point(int x) {
		this.x = x;
		System.out.println("Point 1개 Constructor call");
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point 2개 Constructor call");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y+"]";
	}


	public void display() {
		System.out.println(x+", "+y);
	}
	
}
