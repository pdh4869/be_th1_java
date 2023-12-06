package homework;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b;
		int org_a, org_b;
		int r;
		for (int i=0;i<n;i++) {
			a = sc.nextInt(); b = sc.nextInt();
			org_a = a;
			org_b = b;
			while (b != 0) {
				r = a % b;
				a = b;
				b = r;
				
				if (b == 0) {
					System.out.println(org_a * org_b / a);
				}
 			}
		}
	}
}
