package quiz;

import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][4];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				if (j != 3) {
					a[i][j] = sc.nextInt();
				} else {
					a[i][j] = a[i][0] * a[i][1] * a[i][2];
				}
			}
		}
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println(a[0][1] + a[1][1]);
		
		
	}
}
