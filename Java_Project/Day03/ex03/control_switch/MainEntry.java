package ex03.control_switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("당신의 포인트 점수는?(1~3): ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point) { // 조건 - 문자형, 정수형(long 제외) 으로 작성, 실수형은 안됨(필요시 형변환).
		case 1:			// 숫자, 문자, 문자열
			System.out.println("1점");
			break;
		case 2:
			System.out.println("2점");
			break;
		case 3:
			System.out.println("3점");
			break;
		default:
			System.out.println("잘못된 점수");
			break;
		}
	}
}
