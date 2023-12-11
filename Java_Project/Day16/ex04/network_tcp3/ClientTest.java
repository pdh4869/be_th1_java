package ex04.network_tcp3;

import java.net.*;
import java.io.*;

public class ClientTest {
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("127.0.0.1", 9000); // 서버측 IP주소, 포트 맞춰야 함
			InputStream is = s.getInputStream(); // read 
			OutputStream os = s.getOutputStream(); // write
			
			String str = "Hello, Server!";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
