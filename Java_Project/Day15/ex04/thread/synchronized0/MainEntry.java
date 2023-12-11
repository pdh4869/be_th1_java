package ex04.thread.synchronized0;

class ATM {
	private int money;

	public ATM(int money) {
		this.money = money;
	}
	
	// 입금함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name+": 입금금액 " + amount);
	}
	
	public void withdraw(int amount, String name) {
		synchronized (this) {
			if ((money - amount) > 0) {
				Thread.yield();
				money -= amount;
				System.out.println(name +": 출금금액 "+amount);
			} else {
				System.out.println(name+": 출금 못함(잔액부족)");
			}
		}
	}
	
	public void getMoney() {
		System.out.println("잔액: "+money);
	}
}

class UserATM extends Thread {
	ATM obj;
	boolean flag = false;
	
	public UserATM(ATM obj, String name) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i=0;i<2;i++) {
			try {
				Thread.sleep(50); // 0.05초
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (flag) {
			obj.deposit((int)(Math.random() * 10 + 2) * 100, getName());
		} else {
			obj.withdraw((int)(Math.random() * 10 + 2) * 100, getName());
		}
		flag = true;
		obj.getMoney();
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		ATM at = new ATM(1000);
		UserATM user1 = new UserATM(at, "김연아");
		UserATM user2 = new UserATM(at, "박태환");
		UserATM user3 = new UserATM(at, "전두환");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}
}
