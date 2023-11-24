package ex03.random;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Math.random()); // 0.0 ~ 1.0
		System.out.println(Math.random() * 5); // 0~4
		System.out.println((int)(Math.random() * 5));
		System.out.println((int)(Math.random() * 5)+1); //1~5
		
		for (int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random() * 45) +1);
		}
		
		System.out.println("-----------------------------");
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(5)); // 0~4

	}
}
