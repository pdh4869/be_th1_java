package ex01.control_while;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 3) {
			System.out.print(a + "\t");
			a++;
		}
		// while (a++ <= 3) {System.out.print(a + "\t");} 으로도 작성가능
		System.out.println();
		a = 1;
		do {
			System.out.print(a + "\t");
			a++;
		} while (a <= 3);
		System.out.println();
		// 문제1 - 구구단
		System.out.print("출력할 단을 선택하세요: ");
		int s = new Scanner(System.in).nextInt();
		int i = 1;
		while (i < 10) {
			System.out.print(s+"*"+i+" = "+(s*i)+" ");
			i++;
		}
		System.out.println();
		// do ~ while 구구단
		i = 1;
		do {
			System.out.print(s+"*"+i+" = "+(s*i)+" ");
			i++;
		} while (i < 10);
	}
}
