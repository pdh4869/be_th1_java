package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// key, value 한쌍으로 처리(set + list)
 
public class HashMapEx4 {
	public static void main(String[] args) {
		String[] data = {"A", "K", "B","K","A","K","K","Z","A"};
		HashMap map = new HashMap();
		
		for (int i=0;i<data.length;i++) {
			if (map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			} else {
				map.put(data[i], new Integer(1));
			}
		}
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+" : "+printBar('#', value)+" "+value);
		}
		
	
		
	}
	public static Object printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for (int i=0;i<bar.length;i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}
}
