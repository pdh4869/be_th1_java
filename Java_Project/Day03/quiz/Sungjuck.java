package quiz;

import java.util.Scanner;

public class Sungjuck {
	public static void main(String[] args) {
		// 3과목, 총점, 평균, 학점(if,switch)
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int total = a+b+c;
		double avg = total / 3.0;
		char grade;
		switch ((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("***********성적표***********");
		System.out.println("국어: "+a+", 영어: "+b+", 전산: "+c);
		System.out.println("총점: "+total+String.format(", 평균: %.2f", avg)+", 학점: "+grade);
	}
}
