package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEx2 {
	public static void main(String[] args) {
		Object[] obj = {"1", new Integer(1), "2", "3", "4", "4", "4"};
		Set set = new HashSet(); // E - Enumeration
		
		
		for (int i=0;i<obj.length;i++) {
			set.add(obj[i]);
		}
		
		System.out.println(set);
	}
}
