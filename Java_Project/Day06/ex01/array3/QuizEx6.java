package ex01.array3;

public class QuizEx6 {
	public static void main(String[] args) {
		int[][] score = {{98,98,90,92,99},
				{81,82,83,84,85},
				{71,73,75,77,79},
				{60,65,60,65,69},
				{77,74,79,78,72}};
		int rowTotal[] = new int[6];
		int total = 0;
		
		double rowAvg[] = new double[6];
		double avg = 0;
		for (int i=0;i<score.length;i++) {
			for (int j=0;j<score[0].length;j++) {
				rowTotal[i] += score[i][j];
				rowAvg[i] = rowTotal[i] / score[i].length;
				
			}
			total += rowTotal[i];
			avg += rowAvg[i];
		}
		avg = avg / score.length;
		
		for (int i=0;i<score.length;i++) {
			System.out.println(i+"행 총점: "+rowTotal[i]);
			System.out.println(i+"행 평균: "+rowAvg[i]);
		}
		
		System.out.println("전체 총점: "+total);
		System.out.println("전체 평균: "+avg);
	}
}
