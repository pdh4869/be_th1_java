import java.util.ArrayList;
import java.util.Scanner;

public class HW1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c; a = sc.nextInt();
		int bmax=-10000, bmin = Integer.MAX_VALUE;
		int cmax=-10000, cmin = Integer.MAX_VALUE;
		int x,y;

		
		for (int i=0;i<a;i++) {
			b = sc.nextInt(); c = sc.nextInt();
			bmax = Math.max(bmax, b);
			bmin = Math.min(bmin, b);
			cmax = Math.max(cmax, c);
			cmin = Math.min(cmin, c);
		}
		
		
		
		x = bmax - bmin;
		y = cmax - cmin;
		System.out.println(x*y);
	}
}
