package ex01.arraymethod;

/* static method: 객체 생성 없이 바로 사용 가능
 * objectName.methodName();
 * className.methodName();
 * public static void로 작성
 */

class A {
	int x,y;

	public static void setData(int xx, int yy) {
		System.out.println(xx+", "+yy);
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A.setData(11, 22); // ctrl + space 눌렀을 때 초록색 원 위에 S 있으면 static 의미.
		A obj = new A();
		obj.x = 9;
		System.out.println(obj.x);
		obj.setData(1, 2);
		A.setData(50, 70);
	}
}
