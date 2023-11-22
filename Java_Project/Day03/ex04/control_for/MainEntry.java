package ex04.control_for;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		/*
		 * for (int i=0;i<5;i++) { System.out.println("Hi"); }
		 * 
		 * for (int i=1;i<101;i++) { if (i % 10 == 0) { System.out.print(i+"\t\n"); }
		 * else { System.out.print(i+"\t"); } }
		 * 
		 * int n = new Scanner(System.in).nextInt(); for (int i=1;i<=9;i++) {
		 * System.out.print(n+" * "+i+" = "+n*i); } 
		 */
		int sum = 0, cnt=0;
		for (int i=1;i<=100;i++) {
			if (i%3 == 0) {
				sum += i;
				cnt += 1;
			}
		}
		System.out.println("합: "+sum+", 개수: "+cnt);
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (i >= j) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		System.out.println( );
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (i <= j) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
