package ex05.method_argumentvariabe;

public class MainEntry {
	public static void plus(int...x) {
		int sum = 0;
		for (int i=0;i<x.length;i++) {
			sum += x[i];
		}	
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		plus(1,2,3,4,5,6);
	}
}
