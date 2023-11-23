package ex01.control_while;

import java.util.Scanner;

public class MultiWhile {
	public static void main(String[] args) {
		/*
		 * int a=1,b=1;
		 * 
		 * while (a <= 2) { while (b <= 3) { System.out.print(b + "\t"); b++; }
		 * System.out.println("안쪽 변수: "+b); a++; System.out.println(); }
		 */
		
		/*
		 * int i=1,j=0; do { j = 1; do { System.out.print(i+"*"+j+" = "+(i*j)+" "); j++;
		 * } while (j <= 9); System.out.println(); i++; } while (i<=9);
		 */
		int su;
		do { 
			System.out.print("점수(0~100): ");
			su = new Scanner(System.in).nextInt();
			System.out.println("점수: "+su);
		} while (su >= 0 && su <= 100);
	}
}
