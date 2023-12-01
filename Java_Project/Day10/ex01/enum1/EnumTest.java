package ex01.enum1;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}
public class EnumTest {
	Day day;
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tell() {
		switch (day) {
		case MONDAY:
			System.out.println("Monday sucks");
			break;
		case FRIDAY:
			System.out.println("Friday good");
			break;
		case SATURDAY:
			System.out.println("Saturday best");
			break;
		default:
			System.out.println("weekdays. soso");
			break;
		}
	}
}
