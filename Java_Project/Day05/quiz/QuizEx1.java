package quiz;

public class QuizEx1 {
	public static void main(String[] args) {
		int[] su = {1, 7, 4, 7, 55, 90, 100, 3, 6, 2, 29};
		int cnt = 0;
		
		for (int i : su) {
			if (i == 7) cnt += 1;
		}
		System.out.println(cnt);
	}
}
