package ex05.innerclass;

import ex05.innerclass.OuterClass.InnerClass;

class OuterClass { 
	static int no;
	String message = "Hello";
	
	public void outerMethod() {
		System.out.println("outer method call");
		
	}
	
	class InnerClass {
		int su = 99;
		
		public void show() {
			System.out.println(su);  // 내부(자신의 것) 사용 가능
			System.out.println(message); // 외부 클래스 멤버 사용 가능
		}
		
		public void disp() {
			outerMethod();
		}
	}
}

public class MainEntry {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();
		inner.show();
		System.out.println("----------------------");
		
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.disp();
		ic.show();
	}
}
