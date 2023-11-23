package ex03.control_ifswitch;

import java.util.Scanner;

public class BasicOperation {
	public static void main(String[] args) {
		System.out.print("x,y,op = ");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		char op = sc.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println(x+" "+op+" "+y+" = "+(x+y));
			break;
		case '-':
			System.out.println(x+" "+op+" "+y+" = "+(x-y));
			break;
		case '*':
			System.out.println(x+" "+op+" "+y+" = "+(x*y));
			break;	
		case '/':
			System.out.println(x+" "+op+" "+y+" = "+(x/y));
			break;
		}
	}
}
