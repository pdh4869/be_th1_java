package ex01.control;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		// if문 내에 한줄이면 {}안써도 됨. 2줄이상은 써야함
		/*
		 * if (su % 2 == 0) System.out.println("짝수"); 
		 * else System.out.println("홀수");
		 */
		
		/*
		 * if (su % 2 == 0) { System.out.println(su +": even"); System.out.println(1);
		 * System.out.println(2); } else { System.out.println(su + ": odd");
		 * System.out.println(3); System.out.println(4); }
		 */
		
		if (su > 0) {
			System.out.println("양수");
		} else if (su == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
	
		
	}
}
