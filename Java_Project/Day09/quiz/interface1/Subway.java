package quiz.interface1;

public class Subway implements Trans {
	String trs= "";
	@Override
	public void start() {
		trs = "Subway";
		System.out.println(trs + " Go");
	}

	@Override
	public void stop() {
		trs = "Subway";
		System.out.println(trs + " Stop");
	}

}
