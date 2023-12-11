package quiz_1207;

import java.io.*;

public class MainEntry {
	static double height, weight;
	static char gender;
	
	public static void menu() {
		System.out.println("\n\n=================메뉴=================");
		System.out.println("1. BMI 정보 입력");
		System.out.println("2. BMI 정보 삭제");
		System.out.println("3. BMI 정보 수정");
		System.out.println("4. BMI 정보 출력");
		System.out.println("5. 종료");
		System.out.println("======================================");
		System.out.print(" >> ");
	}
	
	public static void main(String[] args) {
		BMIManager bmi = new BMIManager();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				menu();
				int inNum = Integer.parseInt(br.readLine());
				try {
					switch (inNum) {
					case 1:
						System.out.println("\n -- 1. BMI 정보 입력 -- ");
						bmi.add();
						break;
					case 2:
						System.out.println("\n -- 2. BMI 정보 삭제 -- ");
						bmi.display();
						System.out.print("삭제할 정보의 인덱스를 입력해주세요: ");
						inNum = Integer.parseInt(br.readLine());
						bmi.delete(inNum);
						break;
					case 3:
						System.out.println("\n -- 3. BMI 정보 수정 -- ");
						bmi.display();
						System.out.print("수정할 정보의 인덱스를 입력해주세요: ");
						inNum = Integer.parseInt(br.readLine());
						bmi.modify(inNum);
						break;
					case 4:
						System.out.println("\n -- 4. BMI 정보 출력 -- ");
						bmi.print();
						break;
					case 5:
						System.out.println("\n -- 프로그램 종료 -- ");
						System.exit(0);
					case 6:
						bmi.makeFile();
						break;
					case 7:
						bmi.readFile();
						break;
					default:
						System.out.println("\n잘못 입력했습니다.");
					}
				} catch (Exception e) {
					System.out.println("다시 입력해주세요");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
