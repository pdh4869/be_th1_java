package ex01.collection.map;

import java.util.HashMap;
import java.util.Scanner;

// key, value 한쌍으로 처리(set + list)
public class HashMapEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("encore", "1234");
		map.put("kosa", "1111");
		map.put("king", "9888");
		map.put("queen", "1245");
		
		System.out.println(map);
		System.out.println("요소개수: "+map.size());
		
		while (true) {
			System.out.println("id, pw를 입력해주세요");
			System.out.print("id: "); String id = sc.next().trim();
			System.out.print("pw: "); String pw = sc.next().trim();
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if (!map.get(id).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("로그인 성공");
					break;
				}
			}
		}
	}
}
