package ex03.control_switch;

import java.util.Scanner;

// 숫자입력받아 짝/홀 판정
public class QuizSwitchEx1 {
	public static void main(String[] args) {
		System.out.print("point = ");
		int num = new Scanner(System.in).nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("짝");
			break;
		case 1:
			System.out.println("홀");
			break;
		default:
			System.out.println("양의 정수를 입력하세요");
			break;
		}
	}
}
