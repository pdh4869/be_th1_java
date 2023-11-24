package ex03.random;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		int cnt = 0;
		int pick = 0;
		
		for (int i=0;i<6;i++) {
			pick = (int)(Math.random()*45) + 1;
			a[i] = pick;
			for (int j=0;j<i;j++) {
				if (pick == a[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i : a) {
			System.out.print(i+" ");
		}		
	}	
}
