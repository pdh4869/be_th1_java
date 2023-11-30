package ex04.interface2;

public class MainEntry {
	public static void main(String[] args) {
		BB b = new BB();
		b.draw();
		b.show();
		
		IDraw id = new BB();
		id.draw();
	}
}
