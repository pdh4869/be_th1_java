package quiz.interface1;

public class Bus implements Trans {
	String trs= "";
	@Override
	public void start() {
		trs = "Bus";
		System.out.println(trs + " Go");
	}

	@Override
	public void stop() {
		trs = "Bus";
		System.out.println(trs + " Go");
	}

}
