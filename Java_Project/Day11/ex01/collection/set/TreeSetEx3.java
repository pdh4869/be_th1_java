package ex01.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elavator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search: from "+ from + " to "+to);
		// 우선순위 - 영문 대문자 > 소문자 > 숫자 > 한글(그 외 나라 언어) 
		System.out.println("result: "+set.subSet(from, to)); // a ~ d
		System.out.println("result: "+set.subSet(from, to+"zzz"));
	}
}
