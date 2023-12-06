package ex01.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

// ctrl + shift + o => import 선택/한번에 지우기
// List - 순서 o, 중복 허용
public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3, 5); // 초기값 3, 부족할 시 5씩 추가
		v.addElement("자바");
		v.addElement(new Double(12.34));
		v.addElement(date);
		System.out.println(v);
		
		System.out.println("------객체 3개 추가------");
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		
		for (i=0;i<10;i++) {
			v.addElement(new Integer(i));
		}

		System.out.println("------객체 10개 추가------");
		System.out.println(v);
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		
		System.out.println("------Vector 내용 출력------");
		Enumeration enu = v.elements();
		
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() +"\t");
		}
		System.out.println("\n\n-------객체 내용 포함 확인--------");
		if (v.contains("자바")) {
			System.out.println("자바 문자열 포함");
		} else {
			System.out.println("자바 문자열 미포함");
		}
		
		System.out.println("12.34 위치: "+v.indexOf(new Double(12.34)));
		System.out.println("입력 시간: "+date);
		System.out.println(v.get(v.indexOf(date)));
		
		// date 객체 삭제 
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		System.out.println("---------------------------------------------");
		
		
		enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}
		System.out.println("\n---------------------------------------------");
		
		for (i=0;i<v.size();i++) {
			v.removeElementAt(i);
		}
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		
		System.out.println("---------------삭제 후 남은 데이터------------------");
		for (i=0;i<v.size();i++) {
			System.out.print(v.get(i) +", ");
		}
		
		System.out.println("\n\n==================================");
		v.setElementAt("java", 2);
		
		for (i=0;i<v.size();i++) {
			System.out.print(v.get(i) +", ");
		}
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		
		v.removeAllElements(); // 모든 요소 제거 
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		v.trimToSize(); // 용량 조정
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
	}	
}
