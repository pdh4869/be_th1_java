package ex02.array2;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// int[][] a = new int[2][3];
		// int[][] a = new int[][] { {1,2,3}, {4,5,6} };
		// int[][] a = {{1,2,3},{4,5,6}};
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[2][3];
		int sum = 0;
		
		System.out.print("입력: ");
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}
		}
		System.out.println("합: "+sum);
	}
}
