package quiz;

import java.util.Date;
import java.util.Scanner;

public class MainEntry {
	static String title, category, lendName;
	static char lendYN;
	static Date lendDate;
	
	public static void menu() {
		System.out.println("\n\n=================메뉴=================");
		System.out.println("1. 대여 정보 입력");
		System.out.println("2. 대여 정보 삭제");
		System.out.println("3. 대여 정보 수정");
		System.out.println("4. 대여 내역 보기");
		System.out.println("5. 종료");
		System.out.println("======================================");
		System.out.print(" >> ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		VideoManager vm = new VideoManager();
		
		try {
			while (true) {
				menu();
				int inNum = sc.nextInt();
				try {
					switch (inNum) {
					case 1:
						System.out.println("\n\n -- 1. 대여 정보 입력 --");
						vm.add(i);
						i++;
						System.out.println(" -- 입력 완료 -- ");
						break;
					case 2:
						System.out.println("\n\n -- 2. 대여 정보 삭제 -- ");
						vm.print();
						System.out.print("삭제할 고객 번호 입력: "); inNum = sc.nextInt();
						vm.remove(inNum);
						break;
					case 3:
						System.out.println("\n\n -- 3. 대여 정보 수정 -- ");
						vm.print();
						System.out.print("수정할 고객 번호 입력: "); inNum = sc.nextInt();
						System.out.print("비디오 제목: "); title = sc.next();
						System.out.print("장르: "); category = sc.next();
						System.out.print("대여자: "); lendName = sc.next();
						System.out.print("대여여부: "); lendYN = sc.next().charAt(0);
						lendDate = new Date();
						vm.change(inNum,title,category,lendName,lendYN,lendDate);
						break;
					case 4:
						System.out.println("\n\n -- 4. 대여 정보 보기 -- ");
						vm.print();
						break;
					case 5:
						System.out.println("종료");
						System.exit(0);
					default:
						System.out.println("잘못 입력했습니다. 다시 입력해주세요");
					}
				} catch (Exception e) {
					System.out.println("없는 고객입니다. 다시 입력해주세요.");
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다. 종료합니다.");
		}
	}
}
