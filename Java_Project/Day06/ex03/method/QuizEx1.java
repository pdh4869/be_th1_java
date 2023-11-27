package ex03.method;

import java.util.Scanner;

public class QuizEx1 {
	public static void line() {
		System.out.println("--------------------------------------");
	}
	
	public static void info(String name, String phone, String address) {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phone);
		System.out.println("주소: "+address);
	}
	
	public static int abs(int x) {
		if (x > 0) {
			return x;
		} else {
			return -x;
		}
	}
	public static void main(String[] args) {
		info("park", "1234", "동작구");
		line();
		System.out.println(abs(-25));
		line();
		System.out.println(abs(30));
		line(); 
		max();
	}
	
	public static void max() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int res = (x > y) ? x : y;
		System.out.println("max: "+res);
	}
}
