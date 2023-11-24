package ex01.array;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		char ch[];
		ch = new char[4];
		
		// 2.
		char[] ch2 = new char[4];
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[0]);
		System.out.println(ch2[3]);
		
		for (int i=0;i<4;i++) {
			System.out.println("ch2["+i+"]: "+ch2[i]);
		}
		
		// 3.
		char ch3[] = {'J','A','V','k','p','a','b','Y'};
		System.out.println(ch3.length);
		
		for (int i=0;i<ch3.length;i++) {
			System.out.println("ch3["+i+"]: "+ch3[i]);
		}
		
		
		// 4.
		String[] str = {"a", "kbs", "park", "kim", "kirt"};
		
		for (int i=0;i<str.length;i++) {
			System.out.println("str["+i+"]: "+str[i]);
		}
		
		// char[] ch4 = {}
		// char[] ch5 = new char[] {};
	}
}
