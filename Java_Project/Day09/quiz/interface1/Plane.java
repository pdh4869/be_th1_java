package quiz.interface1;

public class Plane implements Trans {
	String trs= "";
	@Override
	public void start() {
		trs = "Plane";
		System.out.println(trs + " Go");
		
	}

	@Override
	public void stop() {
		trs = "Plane";
		System.out.println(trs + " Stop");
		
	}

}
