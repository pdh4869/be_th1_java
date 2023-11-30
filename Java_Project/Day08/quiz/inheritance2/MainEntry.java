package quiz.inheritance2;

public class MainEntry {
	public static void main(String[] args) {
		Student s = new Student("kim", "Male", 25, 80);
		Person p = new Person("Lee", "Male", 20);
		s.display();
		line();
		
		p.display();
	}
	public static void line() {
		System.out.println("-----------------------------------------------------");
	}
}
