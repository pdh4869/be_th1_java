package quiz;

import java.util.Scanner;

public class NewSwitch {
	public static void main(String[] args) {
		System.out.println("원하는 달의 일수 확인");
		int month = new Scanner(System.in).nextInt();
		int day = 0;
		String res = null;
		boolean flag = false;
		
		// jdk 14 이후 새로 추가된 switch 방식
		/*
		 * int day = switch(month) { case 1,3,5,7,8,10,12 -> {
		 * System.out.println("31일까지 있음"); yield 31; } case 4,6,9,11 -> {
		 * System.out.println("30일까지 있음"); yield 28; } default -> {
		 * System.out.println("없는 달. 1~12월까지만 입력"); } }
		 */
		
		switch(month) {
		case 1: case 3:case 5:case 7:case 8:case 10:case 12: day=31;break;
		case 4:case 6:case 9:case 11: day=30;break;
		default: day=28;break;
		}
	}
}
