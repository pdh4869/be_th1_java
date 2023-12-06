package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");
		hs.add("컵");
		hs.add("마우스");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수: "+hs.size());
	
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------------------------------");
		HashSet<Integer> hs2 = new HashSet<>(); //<> 내에는 객체형태만 와야 함
		hs2.add(200);
		hs2.add(10);
		hs2.add(1000);
		hs2.add(30);
		
		for (Integer i : hs2) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------------------");
		
		for (String i : hs) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------------------");
		
		for (Object i : hs) { // 어떠한 타입도 다 출력 가능
			System.out.println(i);
		}
		System.out.println("-----------------------------------------------");
		
		it = hs2.iterator();
		while (it.hasNext()) { // 다음요소가 있는지 확인. 없으면 false. 
			System.out.println(it.next()); // 요소를 꺼내어 출력
		}
	}
}
