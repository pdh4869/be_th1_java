package ex04.api_wrapper;

class Point {}
public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(9);
		Integer Ib = new Integer("9");
		String su = "30";
		int x = 10;
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(pt.hashCode());
		
		System.out.println(Ia);
		System.out.println(Ia.hashCode());
		System.out.println(Ia.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode()));
		System.out.println();
		// Boxing vs UnBoxing
		int y = 5;
		double d = 3.3;
//		d = y; // 묵시적 형변환
		y = (int)d; // 명시적 형변환
		
		int c = Ia.intValue(); // jdk 4.x 이전부터 사용
		int e = Ib;  // jdk 5.x 이후부터 auto boxing.unboxing 가능
		int num = Integer.parseInt(su);
		
		System.out.println(c+num);
		System.out.println(c+e);
		System.out.println(Ia.MAX_VALUE);
		System.out.println(Ia.MIN_VALUE);
		System.out.println();
		
		Double dd = new Double(12.34);
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println();
		
		c = (int)dd.doubleValue();
		System.out.println("형변환한 c의 값은? "+c);
		
		int f = Integer.parseInt("123");
		int g = Integer.parseInt("1111111",2);
		System.out.println(f);
		System.out.println(g);
		System.out.println();
		
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toBinaryString(10));
		
		int h = 3; // 스택 저장
		Integer i = new Integer(3); // 힙 저장
		
	}
}


