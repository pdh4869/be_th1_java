package ex03.control_switch;

import java.util.Scanner;

public class IfScore {
	public static void main(String[] args) {
		System.out.print("점수 입력(k,e,c): ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int e = sc.nextInt();
		int c = sc.nextInt();
		
		int total = k+e+c;
		double avg = total/3.0;
		char grade;
		
		if (avg >= 90 && avg <= 100) {
			grade = 'A';
		} else if (avg >= 80 && avg < 90) {
			grade = 'B';
		} else if (avg >= 70 && avg < 80) {
			grade = 'C';
		} else if (avg >= 60 && avg < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
}
