package ex02.inheritance;

public class Circle extends Point {
	private int r;
	
	public Circle() {
		r = 5;
		System.out.println("Circle Default Constructor call");
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
		System.out.println("Circle 3개 Constructor call");
	}
	
	public Circle(int r) { 
		this.r = r;
		System.out.println("Point 1개 Constructor call");
	}
	
	public void display() {
		System.out.println(x+", "+y+", "+r);
	}
}
