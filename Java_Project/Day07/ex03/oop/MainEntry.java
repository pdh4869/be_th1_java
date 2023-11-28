package ex03.oop;

class Point {
	private int x,y; // 멤버변수, int 0, double/float 0.0, String null로 초기화
	
	// 멤버함수 - getter, setter
	public void setX(int xx) { x=xx;}
	public int getX() {return x;}
	public void setY(int yy) { y=yy;}
	public int getY() {return y;}
	public void display() {
		System.out.println(x+", "+y);
	}
}

class Circle {
	private int x,y,r;
	public void setX(int xx) { x=xx;}
	public int getX() {return x;}
	public void setY(int yy) { y=yy;}
	public int getY() {return y;}
	public void setR(int rr) { r=rr;}
	public int getR() {return r;}
	
	public void circle() {
		System.out.println("pi: "+r*r*3.14);
	}
	
}
public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); // 객체 생성, 메모리 할당, 생성자함수 자동 호출
		System.out.println(pt.getX()+", "+pt.getY());
		
		pt.setX(55);
		pt.setY(100);
		System.out.println(pt.getX()+", "+pt.getY());
		
		Circle cl = new Circle();
		cl.setR(3);
		cl.circle();
	}
}
