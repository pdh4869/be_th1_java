package ex03.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in; // 표준 입력
		// int num = is.read(); // 예외 발생: 0~9 -> 아스키코드 48 ~ 57

		try {
			System.out.print("단일 문자 입력: ");
			
			int num = is.read() - 48;
			System.out.println(num);
			is.read(); is.read();
			int num2 = is.read() - 48;
			System.out.println(num + num2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
