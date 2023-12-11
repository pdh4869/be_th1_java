package ex03.thread;

public class MainEntry {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 ID: "+id);
		System.out.println("현재 스레드 priority: "+priority);
		System.out.println("현재 스레드 State: "+state);
	}
}
