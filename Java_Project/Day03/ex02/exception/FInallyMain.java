package ex02.exception;

import java.util.Scanner;

public class FInallyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x y = ");
		int x, y, res=0;
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			res = x / y;
			System.out.println(x + "/" + y + " = "+res);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finally는 무조건 처리");
		}
	}
}
