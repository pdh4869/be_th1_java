package ex01.control;

import java.util.Scanner;

public class QuizIf2 {
	public static void main(String[] args) {
		System.out.print("year= ");
		int year = new Scanner(System.in).nextInt();
		String res = null;
		boolean flag = false;
		
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				flag = true;
			}	
		} 
		
		if (flag == true) System.out.println("윤년");
		else System.out.println("평년");
	}
}
