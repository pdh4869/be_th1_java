package ex01.io.file;

import java.io.File;
import java.io.IOException;

public class FileInformation  {
	public static void main(String[] args) throws IOException {
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.print("file name: "); // 상대경로 - test.txt
		
		System.in.read(fileName);
		strName = new String(fileName).trim();
		
		file = new File(strName);
		
		System.out.println("절대 경로: "+file.getAbsolutePath());
		System.out.println("표준 경로: "+file.getCanonicalPath());
		System.out.println("최종 수정일: "+file.lastModified());
		System.out.println("파일 크기: "+file.length());
		System.out.println("읽기 속성: "+file.canRead());
		System.out.println("쓰기 속성: "+file.canWrite());
		System.out.println("파일 경로: "+file.getPath());
		System.out.println("숨김 속성: "+file.isHidden());
	}
}
