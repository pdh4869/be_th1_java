package ex01.array;

public class ForEachTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// 전체 출력
		for(int i : arr) {
			 System.out.println(i);
		}
		
		int[] score = {80,90,99,78,87};
		int sum = 0;
		for (int i : score) {
			sum += i;
		}
		System.out.println(sum);
	}
}
