package ex03.io;

import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		System.out.print("input: ");
		try {
			InputStream is = System.in;
			int su;
			while ((su=System.in.read()) != -1) { // while (su != -1) {
				if (su == 10 || su == 13 || su == 32) continue;
				if (su == 113 || su == 81) break;
				char ch = (char)su;
				System.out.println(ch);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
