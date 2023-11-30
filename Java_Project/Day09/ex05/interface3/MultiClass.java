package ex05.interface3;

import ex02.abstract2.Shape;
import ex04.interface2.IDraw;

public class MultiClass extends Shape implements Test, IDraw {
	String name = "lee";
	@Override
	public void draw() {
		System.out.println("IDraw interface");
	}

	@Override
	public void tshow(String name) {
		System.out.println("Test interface");
		System.out.println(name);
	}

	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class");
		return 100;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape abstract class");
		System.out.println(name + ", hi~");
	}

}
