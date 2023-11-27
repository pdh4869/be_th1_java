package ex05.method_overload;

import java.util.Scanner;

public class ScoreEx1 {
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		
		for (int i=0;i<3;i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static String input(String name) {
		return name;
	}
	
	public static int total(int...a) {
		int sum = 0;
		for (int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double average(int...a) {
		double avg = total(a) / a.length;
		return avg;
	}
	
	public static char grade(int...a) {
		double avg = average(a);
		char grd;
		
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		default:
			grd = 'F';
			break;
		}
		return grd;
	}
	
	public static void output() {
		int[] a = input();
		String name = input("park");
		
		System.out.println("이름: "+name);
		System.out.println("총점: "+total(a));
		System.out.println("평균: "+average(a));
		System.out.println("학점: "+grade(a));
	}
	
	public static void main(String[] args) {
		output();
	}
}
