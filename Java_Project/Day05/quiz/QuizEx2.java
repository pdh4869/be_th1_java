package quiz;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * double array[] = new double[3]; double sum = 0;
		 * 
		 * for (int i=0;i<3;i++) { array[i] = sc.nextDouble(); sum += array[i]; }
		 * System.out.println(sum/3.0);
		 */
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] com = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] grade = new char[3];
		String[] name = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("이름: ");
			name[i] = sc.next();
			System.out.print("국어, 영어, 수학: ");
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			com[i] = sc.nextInt();
			
			
			total[i] = kor[i] + eng[i] + com[i];
			avg[i] = (total[i] / 3.0);
			
			switch ((int)avg[i] / 10) {
				case 10:
				case 9:
					grade[i] = 'A';
					break;
				case 8:
					grade[i] = 'B';
					break;
				case 7:
					grade[i] = 'C';
					break;
				case 6:
					grade[i] = 'D';
					break;
				default:
					grade[i] = 'F';
					break;
			}
			System.out.println(name[i] + "님의 성적표");
			System.out.println("국어: "+kor[i]+", 영어: "+eng[i] + ", 전산: "+com[i]);
			System.out.println("총점: "+(total[i])+", 평균: "+avg[i]+", 학점: "+grade[i]);
		}
		
	
		
		
	}
}
