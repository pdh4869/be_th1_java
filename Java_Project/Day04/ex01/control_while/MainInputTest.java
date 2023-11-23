package ex01.control_while;

public class MainInputTest {
	public static void main(String[] args) {
		// System.out.println("string, int: ");
		
		if (args.length <= 0) {
			System.out.println("데이터 입력: ");
			return;
		}
		
		String name = args[0];
		int su = Integer.parseInt(args[1]);
		
		System.out.println(name+"??");
		System.out.println(su+"!");
	
		
	}
}
