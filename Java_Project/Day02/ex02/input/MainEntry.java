package ex02.input;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, com;
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("전산: ");
		com = sc.nextInt();
		
		int total = kor + eng + com;
		double avg = total/3.0;
		System.out.println("총점: "+total+", 평균: "+avg);
	}
}
