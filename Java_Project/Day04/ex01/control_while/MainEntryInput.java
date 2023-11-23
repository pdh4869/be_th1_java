package ex01.control_while;

import java.util.Scanner;

public class MainEntryInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=3, y=3;
		if (x==y) System.out.println("same");
		else System.out.println("not same");
		
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		if (s1 == s2) System.out.println("same");
		else System.out.println("not same");
		
		if (s1.equals(s2)) System.out.println("same");
		else System.out.println("not same");
		
		
		System.out.print("int, double, char: ");
		int a = sc.nextInt();
		String n = sc.nextLine(); // nextline은 공백 인식 못함, 문자열 먼저 입력받고 숫자 입력
		double b = sc.nextDouble();
		char ch = sc.next().charAt(0); 	
		
		System.out.println(a+" "+b+" "+ch+" "+n);
		
	}
}
