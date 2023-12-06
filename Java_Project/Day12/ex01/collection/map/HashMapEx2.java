package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// key, value 한쌍으로 처리(set + list)
public class HashMapEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 100);
		map.put("kang", 98);
		map.put("kwon", 29);
		map.put("ku", 68);
		System.out.println(map); // dictionary
		
		Set set = map.entrySet(); //System.out.println(set); // array
		
		Iterator it = set.iterator(); 
//		while (it.hasNext()) {
//			System.out.println(it.next()); 
//		}
		 
		// Set set = (Set)map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("name: "+e.getKey()+", Score: "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단: "+set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+(double)total/set.size());
		System.out.println("최고점수: "+Collections.max(values));
		System.out.println("최고점수: "+Collections.min(values));
		
	}
}
