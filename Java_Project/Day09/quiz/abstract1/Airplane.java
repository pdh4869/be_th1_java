package quiz.abstract1;

public class Airplane extends Trans {
	String name = "Airplane";
	@Override
	public void start() {
		System.out.println(name+" Go");
	}

	@Override
	public void stop() {
		System.out.println(name+" Stop");
	}

}
