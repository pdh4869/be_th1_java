package ex06.staticmember;

class Atm {
	int cnt;
	static int total;
	
	public Atm(int amount) {
		cnt += amount;
		total += amount;
	}
	
	public void display() { // instance method에서는 둘 다 사용 가능
		cnt = cnt + 200;
		total = total + 200;
		System.out.println("Count: "+cnt);
		System.out.println("Total: "+total);
	}
	
	public void show(int cnt, int total) {
		this.cnt = cnt;
		// this.total = total; static member에서는 this를 사용하지 않는다.
	}
	public static void view() {
		// cnt += 100; static 메소드에서 static 멤버만 사용 가능
		total += 100;
	}
}
public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display();
		
		Atm at2 = new Atm(1000);
		at2.display();
		
		Atm at3 = new Atm(1000);
		at3.display();
		
		System.out.println(Atm.total);
		System.out.println(at.cnt);
	}
}
