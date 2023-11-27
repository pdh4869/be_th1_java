package ex04.method2;

public class MainEntry {
	// 매개변수 x, 리턴타입 o
	public static String show() {
		String str="Hello String";
		return str;
	}
	
	public static int iShow() {
		int su = 99;
		int su2 = 100;
		return su + su2;
	}
	
	// 매개변수 o, 리턴타입 o
	public static int plus(int x, int y) {
		int hap = x+y;
		return hap;
	}
	
	public static void main(String[] args) {
		System.out.println(show());
		System.out.println(iShow());
		System.out.println(plus(1,6));
	}
}
