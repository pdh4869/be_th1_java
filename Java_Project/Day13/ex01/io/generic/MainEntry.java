package ex01.io.generic;

import java.util.Date;

import ex04.oop2.Point;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str=  {"abc", "kbs", "director"};
		t1.set(str);
		
		t1.print();
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = {1,2,3,4,5,6,7,8};
		t2.set(num); t2.print();
		System.out.println("----------------------------------");
		
		GenericEx<Object> t3 = new GenericEx<Object>();
		Object[] obj = {"12.45", 2, new Date(), 47.4, 4.46, "text"};
		t3.set(obj); t3.print();
		System.out.println("----------------------------------");
		
		
	}
}
