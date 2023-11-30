package ex01.default_constructor;

public class MainEntry {
	/**
	 * @param args 메인은 아무 값도 넘겨받지 않음
	 * @author ~
	 * @param x 곱을 구하는 것에 첫번째 정수형 변수
	 * @param y 곱을 구하는 것에 두번째 정수형 변수
	 * @param gob변수는 x, y의 두 정수 곱을 저장하는 변수
	 */

	public static void main(String[] args) {
		int x,y,gob = 1;
		char ch = 'A';
		String msg;
		
		x = 5; y = 10;
		msg = "Hello, java";
		gob = gob(x,y);
		
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x+" * "+y+" = "+gob);
	}

	private static int gob(int x, int y) {
		return x * y;
	}
}
