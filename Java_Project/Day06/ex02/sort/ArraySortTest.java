package ex02.sort;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int tmp;
		
		System.out.println("sort 전 출력");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nsort 후 출력");
		Arrays.sort(a);
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n내림차순 출력");
		Arrays.sort(a);
		for (int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
