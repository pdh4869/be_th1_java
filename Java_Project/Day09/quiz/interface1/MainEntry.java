package quiz.interface1;

public class MainEntry {
	public static void main(String[] args) {
		Trans s = new Subway();
		s.start();
		
		Trans[] transs = {new Subway(), new Bus(), new Plane()};
		
		transs[2].start();
	}
}
