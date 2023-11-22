package ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {
	public static void main(String[] args) throws InputMismatchException, 
			 ArithmeticException {
		// throws ArithmeticException, InputMismatchException { 예외처리 위임
		Scanner sc = new Scanner(System.in);
		System.out.print("x,y = ");
		int x,y,res=0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		res = x/y;
		System.out.println(x + "/" + y +" = "+res); 
	}
}
