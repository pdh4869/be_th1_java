package ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecptionTryMultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try { 
			System.out.println("정수 두개 입력");
			System.out.print("Int 1: "); int n1 = sc.nextInt();
			System.out.print("Int 2: "); int n2 = sc.nextInt();
			System.out.println("n1 / n2 = "+(n1/n2));
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
