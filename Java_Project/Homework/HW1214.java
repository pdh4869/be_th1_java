import java.util.ArrayList;
import java.util.Scanner;

public class HW1214 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b; a=sc.nextInt(); b=sc.nextInt();
		ArrayList<Integer> list = new ArrayList();
		int num;
		
		for (int i=0;i<a-1;i++) {
			num = sc.nextInt();
			list.add(num-b);
			b = num;
		}
		
		int g = list.get(0);
		for (int i=1;i<list.size();i++) {
			g = gcd(g, list.get(i));
		}
		int res = 0;
		for (int i=0;i<list.size();i++) {
			res += list.get(i) / g - 1;
		}
		System.out.println(res);
		
	}
	
	public static int gcd(int x, int y) {
		int mod = x % y;
		while (mod != 0) {
			x = y;
			y = mod;
			mod = x % y;
		}
		return y;
	}
}
