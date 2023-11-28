package ex01.arraymethod;

// instance method: 객체를 생성하고 사용해야 함(메모리 상에 할당되어야 함)
// public void로 작성 (static 제외)
 
class B {
	int x,y;
	
	public void setData(int xx, int yy) {
		System.out.println(xx+", "+yy);
	}
}
public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B(); // 객체 생성, 메모리 할당
		b.setData(100, 250);
		
	}
}
