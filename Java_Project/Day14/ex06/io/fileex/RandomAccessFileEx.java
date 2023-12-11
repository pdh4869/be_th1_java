package ex06.io.fileex;

import java.io.*;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		
		for (int i=0;i<=50;i++) {
			raf.seek(i * 200);
			String str = "Hello";
			raf.writeUTF(str+i);
			// raf.writeInt(i);
		}
		
		for (int i=0;i<=50;i++) {
			raf.seek(i * 200);
			//raf.writeInt(i);
			System.out.println(raf.readUTF());
		}
		
		System.out.println("String print success");
		raf.close();
	}
}
