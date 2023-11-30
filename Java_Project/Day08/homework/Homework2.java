package homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a; 
        String b;
        for (int i=0;i<n;i++) {
        	a = sc.nextInt();
        	b = sc.next();
        	
        	for (int j=0;j<b.length();j++) {
        		for (int k=0;k<a;k++) {
            		System.out.print(b.charAt(j));
            	}
        	}
        	System.out.println();
        }
    }
}
