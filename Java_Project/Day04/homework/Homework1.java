package homework;

import java.util.Scanner;


public class Homework1 {
	public static void main(String[] args) {
		// 1. 1+(1+2)+(1+2+3)+(1+2+3+4) .. = 35
		int cnt = 0;

		for (int i=1;i<=10;i++) {
			for (int j=i;j>=1;j--) {
				cnt += j;
			}
			if (cnt == 35) {
				System.out.println(i);
			}
			
		}
		
		
		// 2. (-1) + 2 + (-3) + (4) + ..... = 5 
		int c2 = 0;
		for (int i=1;i<=10;i++) {
			if (i % 2 == 1) {
				c2 += (i*-1);
			} else {
				c2 += i;
			}
			if (c2 == 5){
				System.out.println(i);
			}
		}
		
		
		// 3. 1/2 + 2/3 + 3/4 + 4/5 .... = 7.07
		double c3 = 0;
		for (int i=1;i<=10;i++) {
			c3 += (double)i/(i+1);
			if (Math.round(c3*100) / 100.0 == 7.07) {
				System.out.println(i);
			}
		}
		
		// 4. 정수 3개 입력, 큰 순으로 출력
		Scanner sc = new Scanner(System.in);
		int z,x,c;
		int tmp2=0;
		z = sc.nextInt(); x = sc.nextInt(); c = sc.nextInt();
		if (z > x) {
			if (z > c)  {
				if (x > c) {
					System.out.println(z+" "+x+" "+c);
				} else {
					System.out.println(z+" "+c+" "+x);
				}
			} else {
				System.out.println(c+" "+z+" "+x);
			}
		} 
	}

}
