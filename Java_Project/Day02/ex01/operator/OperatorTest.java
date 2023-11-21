package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// 관계연산자: >, <, >=, <=, ==, !=
		/*
		 * int x = 3, y = 5; boolean flag = true; System.out.println(!flag);
		 * 
		 * if (x == y) { System.out.println(x); System.out.println("if"); } else {
		 * System.out.println(y); System.out.println("else"); }
		 */
		
		// 논리연산자: &(and), |(or), ^(xor) 2진 논리
		/*
		 * int x=4, y=7; System.out.println(x&y); // 100 & 111 = 100 (둘다 1이면 1)
		 * System.out.println(x|y); // 100 | 111 = 111 (둘중 하나가 1이면 1)
		 * System.out.println(x^y); // 100 ^ 111 = 011 (두개가 달라야 1)
		 */
		
		// 10진 논리연산자 &&, ||, ! (결과가 참이나 거짓) !가 최우선
		int x = 10, y = 20, z = 30;
		boolean res = true;
		
		res = (x > y) && (y > z); // && 연산은 앞이 거짓이면 뒤 수행 x
		System.out.println("&&: "+res);
		
		res = (x < y) && (y < z);
		System.out.println("&&: "+res);
			
		res = (x < y) || (y < z); // || 연산은 앞이 참이면 뒤 수행 x
		System.out.println("&&: "+res);
		
		System.out.println(!res);
		
		
	}
}
