package ex02.thread;

public class UserRunnable implements Runnable {
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// System.out.println("Runnable run() call ");
		for (int i=1;i<=10;i++) {
			if (i == 4) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
	}
	
}
