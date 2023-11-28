package ex04.oop2;

public class Circle {
	private int x,y,r;
	
	
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


	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public void circle() {
		System.out.println("넓이: "+r*r*3.14);
	}
}
