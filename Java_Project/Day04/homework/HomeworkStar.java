package homework;

import java.util.Scanner;

public class HomeworkStar {
	public static void main(String[] args) {
		int n = 5;
	
		// 시작 
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print('*');
			}
			for (int j=1;j<=(2*n)-(2*i);j++) {
				System.out.print(' ');
			}
			for (int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i=n-1;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print('*');
			}
			for (int j=1;j<=(2*n)-(2*i);j++) {
				System.out.print(' ');
			}
			for (int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		} // 끝
		
	}
}
