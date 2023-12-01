package ex02.api_object;

class Rectangle {
	int x,y;
	public void display() {
		System.out.println(x+", "+y);
	}
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
}
public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.display();
		System.out.println(r);
	}
}
