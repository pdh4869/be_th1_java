package ex02.sort;

// 선택 정렬: 기준 있음
public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int tmp;
		
		System.out.println("sort 전 출력");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nsort 후 출력");
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
