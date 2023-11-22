package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int x,y,res;
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			res = x /y;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/* if문으로 예외처리
 * public static void main(String[] args) { int x = 30, y= 0; int res=0;
 * 
 * if (y == 0) { System.out.println("0으로 나눌 수 없습니다"); return; } else { res = x /
 * y; } System.out.println(res); }
 */