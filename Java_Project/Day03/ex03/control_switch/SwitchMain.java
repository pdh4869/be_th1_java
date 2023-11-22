package ex03.control_switch;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요 (s,d,b,j) = ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		switch(ch) {
		case 's': System.out.println("서울"); break;
		case 'd': System.out.println("대구"); break;
		case 'b': System.out.println("부산"); break;
		case 'j': System.out.println("제주"); break;
		default: System.out.println("잘못 선택했습니다. s,d,b,j 중에서만 선택하세요");
				 System.exit(0); //프로그램 강제 종료
		}
	}
}
