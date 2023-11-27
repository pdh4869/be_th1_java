import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i=0;i<a;i++) {
            b[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int cnt = 0;
        for (int i=0;i<a;i++) {
            if (b[i] == n) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
	}
}
