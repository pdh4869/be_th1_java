package ex01.array3;

import java.util.Scanner;

public class QuizEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] a = new int[2][2][3];
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				for (int k=0;k<3;k++) {
					a[i][j][k] = sc.nextInt();
				}
			}
		} 
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				for (int k=0;k<3;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
