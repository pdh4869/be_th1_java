package ex03.random;

import java.util.Scanner;

// 1~100 임의 난수 추출, 5번의 기회 받아 입력
// 입력 숫자와 추출 난수가 같은지 판정

public class UpDownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random() * 100) + 1;
		int a;
		for (int i = 0; i < 5; i++) {
			a = sc.nextInt();
			if (a == ran) {
				System.out.println("정답");
			} else if (a > ran){
				if (i == 4) {
					System.out.println("Down");
					System.out.println("정답은 "+ran);
				} else {
					System.out.println("Down");
				}
			} else {
				if (i == 4) {
					System.out.println("Up");
					System.out.println("정답은 "+ran);
				} else {
					System.out.println("Up");
				}
			}
		}
	}
}
