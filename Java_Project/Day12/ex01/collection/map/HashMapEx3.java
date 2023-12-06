package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// key, value 한쌍으로 처리(set + list)
// 2중 map 

public class HashMapEx3 {
	static HashMap phoneBook = new HashMap();
	public static void main(String[] args) {
		addPhoneNumber("친구", "Kim", "010-1234-5775");
		addPhoneNumber("친구", "Kwon", "010-1612-1245");
		addPhoneNumber("친구", "Lee", "010-2343-3632");
		addPhoneNumber("회사", "Park", "010-2093-0968");
		addPhoneNumber("회사", "No", "010-2478-1267");
		addPhoneNumber("치킨", "010-2938-5343");
		printAll();
	}

	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	public static void addPhoneNumber(String groupName, String name, String tel) {
		addGroup(groupName);
		
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel,name);
	}
	
	public static void addPhoneNumber(String name, String tel) {
		addPhoneNumber("기타", name, tel);
	}
	
	static void printAll() {
		Set set = phoneBook.entrySet(); System.out.println(set);
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			
			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telno = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+" "+telno);
			}
			System.out.println();
		}
	}
}
