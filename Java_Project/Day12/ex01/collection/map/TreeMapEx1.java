package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// key, value 한쌍으로 처리(set + list)
 
public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("zz", 100);
		tm.put("xx", 102);
		tm.put("cc", 103);
		tm.put("dd", 104);
		
		System.out.println("value: "+tm.get("zz"));
		System.out.println(tm);
		
		TreeSet set = new TreeSet();
		for (int i=0;i<5;i++) {
			int num = (int)(Math.random() * 50) + 1;
			set.add(num);
		}
		List list = new LinkedList(set);
		System.out.println(list);
	}
}
