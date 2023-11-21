package ex01.operator;

public class Quiz02 {
	public static void main(String[] args) {
		int su = 12345;
		int t,m,s;
		t = 12345 / 3600;
		su = su % 3600;
		m = su / 60;
		su = su % 60;
		s = su;
		System.out.println(t+"시간");
		System.out.println(m+"분");
		System.out.println(s+"초");
		
		int ss = 12345;
		for (int i=2;i>=0;i--) {
			System.out.println((int)(ss / Math.pow(60, i)));
			ss = (int)(ss % Math.pow(60, i));
		}
	}
}
