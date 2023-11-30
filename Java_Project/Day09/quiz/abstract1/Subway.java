package quiz.abstract1;

public class Subway extends Trans {
	String name = "Subway";
	@Override
	public void start() {
		System.out.println(name+" Go");
	}

	@Override
	public void stop() {
		System.out.println(name+" Stop");
	}

}
