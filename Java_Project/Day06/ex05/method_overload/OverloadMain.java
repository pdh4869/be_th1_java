package ex05.method_overload;

public class OverloadMain {
	public static void line() {
		System.out.println("-----------------------");
		System.out.println();
	}
	
	public static void line(String str) {
		for (int i=0;i<50;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void line(String str, int n) {
		for (int i=0;i<n;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		line("*");
		line("&", 20);
	}
}
