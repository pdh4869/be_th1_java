package ex02.io.filecopy;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class UriCopy {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://img.khan.co.kr/news/2010/02/24/gfsd-3.jpg");
		InputStream is = url.openStream();
		
		OutputStream os = new FileOutputStream("google.jpg");
		byte[] buffer = new byte[1024 * 8];
		
		while (true) {
			int inputData = is.read(buffer);
			if (inputData == -1) break;
			os.write(buffer,0, inputData);
		}
		is.close(); os.close();
		System.out.println("웹에서 파일 복사 성공");
	}
}
