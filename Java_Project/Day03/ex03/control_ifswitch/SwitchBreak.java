package ex03.control_ifswitch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.print("point = ");
		int point = new Scanner(System.in).nextInt();
		switch(point) {
		case 1: System.out.println("집"); 
		case 2: System.out.println("피아노"); 
		case 3: System.out.println("신발"); 

		}
	}
}
