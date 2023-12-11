package ex04.io2;

import java.io.*;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		// InputStream is = System.in;
		// Reader reader = new InputStreamReader(is);
		// BufferedReader br = new BufferedReader(reader);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("character input: ");
		// String str = br.readLine();
		int str = Integer.parseInt(br.readLine());
		int str2 = Integer.parseInt(br.readLine());
		
		
		System.out.println(str+str2);
	}
}
