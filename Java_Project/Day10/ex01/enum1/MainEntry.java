package ex01.enum1;

public class MainEntry {
	public static void main(String[] args) {
		EnumTest e1 = new EnumTest(Day.MONDAY);
		e1.tell();
		
		EnumTest e2 = new EnumTest(Day.WEDNESDAY);
		e2.tell();
		
		EnumTest e3 = new EnumTest(Day.SATURDAY);
		e3.tell();
		
	}
}
