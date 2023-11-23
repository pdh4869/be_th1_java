package ex01.control_breakcontinue;

public class BreakMain {
	public static void main(String[] args) {
		//label :
		for (int i=1;i<6;i++) {
			for (int j=1;j<6;j++) {
				if (j==3) continue; //label;
				System.out.println("i: "+i+", j: "+j);
			}
		}
		int cnt=0;
		for (int i=1;i<=100;i++) {
			if (i%2 == 1) continue;
			if (cnt % 10 == 0) {
				System.out.println();
			} 
			System.out.print(i+" ");
			cnt += 1;
		}
		System.out.println(cnt);
	}
}
