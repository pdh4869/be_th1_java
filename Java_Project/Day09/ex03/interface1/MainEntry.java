package ex03.interface1;

import ex02.abstract2.Shape;

interface A {
	int x = 9; // interface - abstract method, final member만 가질 수 있다.
	public void show(); // abstract 생략
	public abstract void disp();
	public int plus(int x, int y);
}

interface B {
	void bView();
}

interface C {
	String name = "A"; // final 멤버는 초기화해야 함.
	public void draw();
}

interface D extends B {
	void bView();
}

class Rect implements C {
	@Override
	public void draw() {
		System.out.println(name +"님 반갑습니다.");
	}
}

class Multi extends Shape implements B,C,A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int plus(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		int x = 9;
		x = 88;
		// A a = new A(); 클래스가 아니므로 객체 생성 안됨.
		C rr = new Rect();
		rr.draw();
		System.out.println(rr.name);
		
		Multi m = new Multi();
		m.bView();
		m.disp();
		
		Shape m2 = new Multi(); // 부모클래스 이용하여 객체 생성
		m2.calc(3);
		m2.view();
		
		B m3 = new Multi(); // 부모인터페이스를 이용해서 자손클래스 객체 생성 가능
		m3.bView();
		
		A m4 = new Multi();
		m4.plus(1, 2);
		m4.show();
		
	}
}
