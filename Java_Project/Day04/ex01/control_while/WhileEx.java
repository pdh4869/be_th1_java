package ex01.control_while;

import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		/*int su;
		do {
			System.out.print("국어 점수 입력(0~100): ");
			su = new Scanner(System.in).nextInt();
			System.out.println(su);
		} while (su >= 0 && su <= 100);*/
		int k,e,c;
		char yesno;
		while (true) { // 무한루프
			Scanner sc = new Scanner(System.in);
			do { 
				System.out.print("국어 입력: ");
				k = sc.nextInt();
			} while (k < 0 || k > 100);
			
			do {
				System.out.print("영어 입력: ");
				e = sc.nextInt();
			} while (e < 0 || e > 100);
			
			do {
				System.out.print("전산 입력: ");
				c = sc.nextInt();
			} while (c < 0 || c > 100);
			
			int total = k+e+c;
			double avg = total/3.0;
			char grade;
			
			switch((int)(avg / 10)) {
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
			
			System.out.print("국어: "+k+", 영어: "+e+", 전산: "+c+"\n");
			System.out.println("총합: "+total+", 평균"+avg +", 학점: "+grade);
			System.out.println("더 입력하시겠습니까(y/n)?");
			yesno = new Scanner(System.in).next().charAt(0);
			if (yesno == 'n' || yesno == 'N') break;
		} 
	}
}
