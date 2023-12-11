package quiz_io;

import java.io.*;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 입력1: "); int s1 = Integer.parseInt(br.readLine()); 
		System.out.print("정수 입력2: "); int s2 = Integer.parseInt(br.readLine());
		System.out.print("수행할 연산: "); String s3 = br.readLine();
		
		switch (s3.charAt(0)) {
		case '+':
			System.out.println("s1 + s2: "+(s1+s2));
			break;
		case '-':
			System.out.println("s1 - s2: "+(s1-s2));
			break;
		case '*':
			System.out.println("s1 * s2: "+(s1*s2));
			break;
		case '/':
			System.out.println("s1 / s2: "+(s1/s2));
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}
}
