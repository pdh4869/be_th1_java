package ex01.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

// 1: 추가 / 2: 삭제 / 3:전체 출력 / 4: 수정 / 0: 종료

public class MainEntry {
	static String name, address, tel;
	
	public static void menu() {
		System.out.println("\n\n=================메뉴=================");
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 고객 정보 삭제");
		System.out.println("3. 고객 정보 수정");
		System.out.println("4. 모든 고객 보기");
		System.out.println("5. 종료");
		System.out.println("======================================");
		System.out.print(" >> ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerManager cus = new CustomerManager();
		
		try {
			while (true) {
				menu();
				int inNum = sc.nextInt();
				try {
					switch (inNum) {
					case 1:
						System.out.println("\n\n== 1.고객 정보 입력 ==");
						cus.CustomerAdd();
						System.out.println("* 입력완료 *");
						break;
					case 2:
						System.out.println("\n\n== 2.고객 정보 삭제 ==");
						cus.display();
						System.out.println("=======================");
						System.out.print("삭제할 고객 번호를 입력하세요: ");
						inNum = sc.nextInt();
						cus.CustomerRemove(inNum);
						break;
					case 3:
						System.out.println("\n\n== 3. 고객 정보 수정 ==");
						cus.display();
						System.out.print("수정할 고객 번호를 입력하세요: ");
						inNum = sc.nextInt();
						cus.CustomerAdd();
						cus.CustomerChange(inNum, name, address, tel);
						break;
					case 4:
						System.out.println("\n\n== 4. 모든 고객 보기 ==");
						cus.display();
						break;
					case 5:
						System.out.println("\n\n== 프로그램을 종료합니다 ==");
						System.exit(0);
					default:
						System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
					} 
				} catch (Exception e) {
					System.out.println("없는 고객입니다. 다시 입력해주세요.");
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다. 종료합니다.");
			e.printStackTrace();
		}
	}
}

/*
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * int n = 5; Customers c = new Customers("dh", "서울", "010-1234-2345");
 * ArrayList<String>[] ar = new ArrayList[n];
 * 
 * int a; while (true) { a = sc.nextInt(); switch (a){ case 1: for (int
 * i=0;i<n;i++) { System.out.print("이름: "); c.setName(sc.next());
 * System.out.print("주소: "); c.setAddress(sc.next());
 * System.out.print("전화번호: "); c.setTel(sc.next()); ar[i] = new
 * ArrayList<String>(); ar[i].add(c.name); ar[i].add(c.address);
 * ar[i].add(c.tel); } break; case 2: System.out.print("삭제할 사람의 인덱스: "); int q =
 * sc.nextInt(); ar[q].removeAll(null); break; case 3: for (int i=0;i<n;i++) {
 * System.out.println(ar[i]); } case 4: default: System.exit(0); } }
 * 
 * 
 * }
 */
// 문제 Customers class
// 필드 name, address, tel
// 생성자함수, getter/setter method