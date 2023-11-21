package ex02.dataType;

public class MainEntry {
	public static void main(String[] args) {
		int su = 9;
		char ch = 'A';
		String str = "Korea";
		double d = 12.34;
		float f = 12.34f;
		
		System.out.println(su + ", "+ch+", "+str);
		System.out.println("su = "+su);
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println(3.5); // double 
		System.out.println(3.5F); // float
		
		System.out.println(100); // int - 4byte
		System.out.println(100L); // long - 8byte
		
		// 지역변수는 반드시 초기화하고 사용
		int x = 2; // 기본 자료형, primitive type
		Integer y = 2; // 참조형 
		y = x; // 자동 형변환 - auto boxing/unboxing, jdk 5부터 가능 
		// jdk 4.x 까지는 y.intValue()와 같은 함수 사용하여야 했음.
		
		String s1 = "A"; // A\0
		char c1 = 'A'; // A
		
		System.out.println(s1+","+c1);
		
		short ss = 32767;
		System.out.println(ss);
		
		
	}

}

/*
 * for (int i=1;i<=10;i++) { System.out.println(i);
 * 
 * 안녕하세요? for문입니다
 * 
 * // 여러줄 주석 > ctrl + shift + / // 한줄주석 > ctrl + / }
 */