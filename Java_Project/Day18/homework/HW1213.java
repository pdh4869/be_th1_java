package homework;

import java.util.Scanner;

public class HW1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;
		a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
		d = sc.nextInt(); e = sc.nextInt(); f = sc.nextInt();
		
		for (int i=-999;i<1000;i++) {
			for (int j=-999;j<1000;j++) {
				if (a*i + b*j == c && d*i + e*j == f) {
					System.out.println(i+" "+j);
				}
			}
		}
		
	}
}
