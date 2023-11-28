package ex04.oop2;

import java.util.Scanner;

import quiz.scoreclass.Score;

public class MainEntry {
	 public static void main(String[] args) {
			/*
			 * Point pt = new Point(); pt.display(); pt.setX(100); pt.setY(100);
			 * pt.display();
			 * 
			 * Circle cl = new Circle(); cl.setR(3); cl.circle();
			 * 
			 * TV q = new TV(); q.display(); q.setColor("Yellow"); q.setChannel(53);
			 * q.display();
			 */
		 Scanner sc = new Scanner(System.in);
		 System.out.print("점수 입력: ");
		 Score scr = new Score(sc.nextInt(),sc.nextInt(),sc.nextInt());
		 scr.display();
	}
}
