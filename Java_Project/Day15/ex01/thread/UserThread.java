package ex01.thread;

public class UserThread extends Thread {
	String name;
	
	public UserThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for (int i=1;i<=10;i++) {
			if (i == 7) {
				try {
					sleep(3000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
		//super.run(); // 부모가 갖는 run() 호출
	}
	
}
