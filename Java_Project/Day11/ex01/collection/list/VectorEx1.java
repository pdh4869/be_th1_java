package ex01.collection.list;

import java.util.Iterator;
import java.util.Vector;

// List - 순서 o, 중복 허용
public class VectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length      /      capacity");
		System.out.println(v.size() +"          /          "+v.capacity());
		
		
		Vector<Integer> v2 = new Vector<Integer>(3,4);
		v2.add(20);
		v2.add(12);
		v2.add(55);
		v2.add(99);
		v2.add(55);
		System.out.println(v2.size() +"          /          "+v2.capacity());
		
		System.out.println("----------iterator() method--------");
		Iterator it = v2.iterator();
		for (Integer i : v2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("----------get() method-------------");
		for (int i=0;i<v2.size();i++) {
			System.out.print(v2.get(i) +"\t");
		}
		System.out.println();
		System.out.println("----------elementsAt() method------");
		for (int i=0;i<v2.size();i++) {
			Integer num = v2.elementAt(i);
			System.out.print(num.toString()+"\t");
		}
		System.out.println("\n\n");
		System.out.println(v2.size() +"          /          "+v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size() +"          /          "+v2.capacity());
	}	
}
