package ex01.control_breakcontinue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean t = true;
		
		first : {
			second : {
				third : {
					int k = 100;
					System.out.println("Before the break");
					if (t) break second;
					System.out.println("This won't execute");
				}
				System.out.println("123");
			}
		System.out.println("This is after second block");
		}
	}
}
