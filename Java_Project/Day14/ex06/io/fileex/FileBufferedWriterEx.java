package ex06.io.fileex;

import java.io.*;
import java.util.*;

public class FileBufferedWriterEx {
	public static void main(String[] args) throws IOException {
		String str, file;
		Date date = new Date();
		
		str = "파일 생성 시간\n" + date + "\r\n";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 이름 입력: "); file = br.readLine();
		System.out.print("저장할 문자열 입력: "); str += br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		System.out.println(file + "파일을 성공적으로 저장했습니다.");
	}
}
