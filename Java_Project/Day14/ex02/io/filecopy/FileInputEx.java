package ex02.io.filecopy;

import java.util.Scanner;
import java.io.*;

public class FileInputEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			// OutputStream os = new FileOutputStream("test.txt"); 상대경로, 예외발생
			// OutputStream os = new FileOutputStream("C:\\SW CAMP\\4. Java\\be_th1_java\\sample.txt"); 절대경로
			OutputStream os = new FileOutputStream("C:/SW CAMP/4. Java/be_th1_java/sample.txt");
			
			while (true) {
				System.out.println("문자열 입력 요망: ");
				String str = sc.nextLine() + "\r\n";
				
				if (str.equalsIgnoreCase("EXIT\r\n")) {
					System.out.println(str.length()+"만큼 썼습니다.");
					break;
				}
				
				os.write(str.getBytes());
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
	}
}
