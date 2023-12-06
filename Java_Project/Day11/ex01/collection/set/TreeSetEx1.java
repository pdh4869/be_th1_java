package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();  // 타입 파라미터(TreeSet<Type>)지정 x시 어느 타입도 가능.
		int[] score = {100, 80, 90, 70, 60, 56, 87};
		
		for (int i=0;i<score.length;i++) {
			set.add(new Integer(score[i]));
			// set.add(score[i]);
		}
		System.out.println(set); // 자동정렬
		System.out.println("60보다 작은 값: "+set.headSet(new Integer(60)));
		System.out.println("60보다 큰 값: "+set.tailSet(new Integer(60)));
	}
}
