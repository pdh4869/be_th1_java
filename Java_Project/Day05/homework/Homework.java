package homework;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[31];
		int att;
		for (int i=0;i<28;i++) {
			att = sc.nextInt();
			a[att] = 1;
		}
		
		for (int i=1;i<a.length;i++) {
			if (a[i] == 0) {
				System.out.println(i);
			}
		}
		
		
 	}
}
