package ex01.lambda;

// 타입 써야할 상황 있음
interface Message {
	void something(int x, int y); // void 형태 
	// void good(int x);
}

interface Talk {
	void something(String x, String y);
}

class Person { 
	public void greeting(Message msg) {
		msg.something(1, 2);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello", " World");
	}
}

public class LambdaMain4 {
	public static void main(String[] args) {
		Person p = new Person();
		p.greeting(new Message() {

			@Override
			public void something(int x, int y) {
				System.out.println("parameter value: "+x+", "+y);
			}
		});
		
		System.out.println("--------------------------");
		char ch = 'A';
		p.greeting((int x, int y) -> { // 매개변수 목록 2개 이상이면 괄호 생략하면 안됨.
			System.out.println("paramter value: "+x+", "+y);
			// ch = 'B';    - 람다에서 값 변경 불가
			num = 300; // static 값은 변경 가능함.
		});
		
		
		p.greeting((String x, String y) -> {
			System.out.println("paramter value: "+x+", "+y);
		});
	}
	static int num = 30;
}
