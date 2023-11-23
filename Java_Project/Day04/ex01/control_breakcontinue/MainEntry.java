package ex01.control_breakcontinue;

public class MainEntry {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			if (i==7) break;
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=1;i<=10;i++) {
			if (i==7) continue;
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=1;i<=10;i++) {
			if (i%2==1) continue;
			System.out.print(i+" ");
		}
	}
}
