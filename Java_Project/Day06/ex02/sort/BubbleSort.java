package ex02.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int tmp;
		
		System.out.println("sort 전 출력");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nsort 후 출력");
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length-i-1 ;j++) {
				if (a[j] > a[j+1]) {
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
