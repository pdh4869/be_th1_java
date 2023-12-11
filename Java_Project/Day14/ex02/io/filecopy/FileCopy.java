package ex02.io.filecopy;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws Exception { // 예외처리 위임
		// 읽기 객체 - FileInputStream
		 InputStream is = new FileInputStream("abc.png");
		// 쓰기 객체 - FileOutputStream
		 OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Desktop\\a.png");
		 byte[] buffer = new byte[100];
		 
		 long start = System.currentTimeMillis();
		 while (true) {
			 int inputData = is.read();
			 if (inputData == -1) break;
			 os.write(inputData);
		 }
		 
		 long end = System.currentTimeMillis();
		 System.out.println(end - start);
		 is.close();
		 os.close();
		 System.out.println("Copy success");
	}
}
