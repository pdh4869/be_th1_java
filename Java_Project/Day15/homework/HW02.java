package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt(); b = sc.nextInt();
		int c[] = new int[a];
		
		for (int i=0;i<a;i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);
		System.out.println(c[a-b]);
	}
}
