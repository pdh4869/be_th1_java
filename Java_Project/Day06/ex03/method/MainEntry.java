package ex03.method;

public class MainEntry {
	// 매개변수 x, 리턴타입 x
	public static void line() {
		System.out.println("----------------------------------------");
	}
	
	// 매개변수 o, 리턴타입 x
	public static void showName(String name, int age) {
		System.out.println("이름은: "+name);
		System.out.println("나이는: "+age);
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		line();
		showName("park", 26);
		line();
		System.out.println("main stop");
	}
	
}
