package quiz.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Sales s = new Sales(1, "dh", "010-0000-1111", 5000);
		s.display();
		line();
		
		Regular r = new Regular(1, "asd", "Computer", "010-1234-4567", 5000);
		r.display();
		line();
		PartTime p = new PartTime(2, "zxc", "Marketing", "010-1230-0245", 20, 8000);
		p.display();
	}
	
	public static void line() {
		System.out.println("-------------------------------------------------");
	}
}
