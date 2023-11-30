package ex01.abstract1;

abstract class Shape { // 추상 클래스, 슈퍼 클래스
	double result = 0;
	public abstract double calc(); // 추상 메소드
	public abstract void draw(); 
	public void show() { // 일반 메소드
		System.out.println("Super Class - Shape");
	}
}

class Circle extends Shape { // sub class 
	int r=5;
	@Override
	public double calc() { // override 꼭 해야 함. 강제성.
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.printf("원 넓이: %.2fcm^2\n",result);
	}
	
}

class Triangle extends Shape {
	int x = 6, y = 5;
	@Override
	public double calc() {
		result = x * y / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.printf("삼각형 넓이: %.2fcm^2\n", result);
	}
	
}
public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Triangle t = new Triangle();
		t.draw();
	}
}
