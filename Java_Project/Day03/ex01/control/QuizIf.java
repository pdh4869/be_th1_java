package ex01.control;

import java.util.Scanner;

public class QuizIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 문제 1
		 * int i1, i2; System.out.println("큰 수 출력");
		 * 
		 * System.out.print("i1: "); i1 = sc.nextInt(); System.out.print("i2: "); i2 =
		 * sc.nextInt();
		 * 
		 * if (i1 > i2) { System.out.println(i1); } else { System.out.println(i2); }
		 */
		
		// 문제 2
		System.out.print("년도 입력: ");
		int year = sc.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				System.out.println("평년");
			} else {
				if (year % 400 == 0) {	
					System.out.println("윤년");
				} else {
					System.out.println("평년");
				}
			}
		} else {
			System.out.println("평년");
		} 
		
		/* 문제 3
		int com, eng, kor;
		System.out.print("전산: ");
		com = sc.nextInt();
		System.out.println("영어: ");
		eng = sc.nextInt();
		System.out.println("국어: ");
		kor = sc.nextInt();
		double avg = (com+eng+kor) / 3.0;

		if (avg >= 60) {
			if (com < 60 || kor < 60 || eng < 60) {
				System.out.println("불합격");
			} else {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}*/
	}
}
