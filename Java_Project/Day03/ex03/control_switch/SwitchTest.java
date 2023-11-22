package ex03.control_switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("점수 입력(k,e,c): ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int e = sc.nextInt();
		int c = sc.nextInt();
		
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
		System.out.println(grade);
	}
}
