package homework;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;

		a = sc.nextInt(); b = sc.nextInt();
		int[] c = new int[a];
		int summ = 0;
		for (int i=0;i<a;i++) {
			c[i] = sc.nextInt();
		}
		
		for (int i=0;i<a;i++) {
			for (int j=i+1;j<a;j++) {
				for (int k=j+1;k<a;k++) {
					if (c[i] + c[j] + c[k] > b) {
						continue;
					} else {
						summ = Math.max(summ, c[i]+c[j]+c[k]);
					}
				}
			}
		}
		System.out.println(summ);
	}
}
