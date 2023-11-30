package ex02.abstract2;

public abstract class Shape {
	double result = 0;
	public abstract double calc(double x); // 추상 메소드
	public abstract void show(String name); // 추상 메소드
	
	public void view() { // 일반메소드
		System.out.println("Super Class Shape");
	}
}
