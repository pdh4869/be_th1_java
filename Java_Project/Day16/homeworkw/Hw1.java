package homeworkw;

import java.util.HashSet;
import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt(); b = sc.nextInt();
		
		HashSet<Integer> hs1 = new HashSet();
		HashSet<Integer> hs2 = new HashSet();
		HashSet<Integer> hs11 = new HashSet();
		HashSet<Integer> hs22 = new HashSet();
		
		for (int i=0;i<a;i++) {
			int z = sc.nextInt();
			hs1.add(z);
			hs11.add(z);
		}
		
		for (int i=0;i<b;i++) {
			int z = sc.nextInt();
			hs2.add(z);
			hs22.add(z);
		}

		
		hs1.removeAll(hs2);
		hs22.removeAll(hs11);
		System.out.println(hs1.size() + hs22.size());
		
	}
}
