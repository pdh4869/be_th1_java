import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt(); b = sc.nextInt();
		int[][] l1 = new int[a][b];
		int[][] l2 = new int[a][b];
		
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				l1[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				l2[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				System.out.print(l1[i][j]+l2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
