package ex01.array;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for (int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
/*
 * public static void main(String[] args) { int[] arr = {1,2,3,4,5}; int cnt =
 * 0; for (int i=0;i<arr.length;i++) { cnt += arr[i]; } System.out.println(cnt);
 * }
 */