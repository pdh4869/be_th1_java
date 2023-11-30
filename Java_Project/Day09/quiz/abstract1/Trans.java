package quiz.abstract1;

public abstract class Trans {
	String name;
	public abstract void start(); // 추상 메소드
	public abstract void stop(); // 추상 메소드
	
	public void view() { // 일반메소드
		System.out.println("Super Class Shape");
	}
}
