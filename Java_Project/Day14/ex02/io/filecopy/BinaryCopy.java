package ex02.io.filecopy;

import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		//File src = new File("C:\\Windows\\explorer.exe"); // 절대경로
		//File dist = new File("C:\\SW CAMP\\4. Java\\be_th1_java\\explorer_copy.dat");
		File src = new File("C:\\Users\\Playdata\\Desktop\\abc.png");
		File dist = new File("C:\\SW CAMP\\4. Java\\be_th1_java\\abcde.png");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int c;
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dist);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while ((c=bis.read()) != -1) {
				bos.write((char)c);
			}
			System.out.println("파일 복사 성공");
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류");
			// TODO: handle exception
		}
	} 
}
