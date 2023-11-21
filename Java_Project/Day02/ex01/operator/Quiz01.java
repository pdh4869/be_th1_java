package ex01.operator;

public class Quiz01 {
	public static void main(String[] args) {
		int pay = 567890;
		int p_10000, p_1000, p_100, p_10, p_1;
		p_10000 = pay / 10000;
		p_1000 = (pay / 1000) % 10;
		p_100 = (pay / 100) % 10;
		p_10 = (pay / 10) % 10;
		p_1 = pay % 10;
		
		System.out.println("만원: "+p_10000);
		System.out.println("천원: "+p_1000);
		System.out.println("백원: "+p_100);
		System.out.println("십원: "+p_10);
		System.out.println("일원: "+p_1);
		
		for (int i=4;i>=0;i--) {
			System.out.println((int)(pay / (Math.pow(10, i))));
			pay = (int)(pay % (Math.pow(10, i)));
		}
		
	}
}
/* 월급을 단위로 계산
 * 
 */