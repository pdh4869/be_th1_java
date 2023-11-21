package ex02.basic;

public class DataType {
	public static void main(String[] args) {
		/*
		 * short sh = -32768; int su = 32768;
		 * 
		 * // su = sh; // 묵시적(자동) 형변환 sh = (short)su; // 명시적 형변환 - 데이터 손실 발생
		 * System.out.println(sh + ", " + su);
		 */
		 
		char ch = 'A'; // ASCII code
		System.out.println(ch + " ASCII code = " + (int)ch);
		System.out.println('B'+" "+(int)'B');
		
		int num = 9; // 10진수
		int xNum = 0x9; // 16진수 - 0x숫자
		int oNum = 011; // 8진수  - 0숫자
		int bNum = 0B1010; // 2진수 - 0b숫자 (binary)
		
		System.out.println(num+" "+xNum+" "+oNum+" "+bNum);
		System.out.printf("%d %d\n", 0xa, 0xA);
		System.out.printf("%d\n", 012);
		
		System.out.printf("%x %X\n", 10, 10);
		System.out.printf("%o %o\n", 10, 10);
	}
}
