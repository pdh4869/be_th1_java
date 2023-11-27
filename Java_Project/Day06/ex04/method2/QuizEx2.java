package ex04.method2;

import java.util.Scanner;

public class QuizEx2 {
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static void mul() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a*b: "+(a*b));
	}
	
	public static void div() {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		if (b != 0) {
			System.out.println("a/b: "+(a/b));
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 선택: ");
		int num = sc.nextInt();
		int a,b;
		System.out.print("연산할 수 입력: ");
		a = sc.nextInt(); b=sc.nextInt();
		
		
		switch(num) {
		case 1:
			System.out.println(plus(a,b));
			break;
		case 2:
			System.out.println(minus(a,b));
			break;
		case 3:
			mul();
			break;
		case 4:
			div();
			break;
		default:
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
		
	}
}
