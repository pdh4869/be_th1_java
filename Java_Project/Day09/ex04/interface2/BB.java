package ex04.interface2;

public class BB implements IDraw {

	@Override
	public void draw() {
		System.out.println("BB클래스에서 인터페이스 IDraw의 메소드를 오버라이드함");
		System.out.println(su);
	}

	public void show() {
		System.out.println(su);
		// su = 3000; - 값 변경 안됨. (final 생략되었으므로)	
	}
}
