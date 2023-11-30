package quiz.abstract1;

public class Bus extends Trans {
	String name = "Bus";
	@Override
	public void start() {
		System.out.println(name+" Go");
	}

	@Override
	public void stop() {
		System.out.println(name+" Stop");
	}
}
