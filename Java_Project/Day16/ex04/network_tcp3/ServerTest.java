package ex04.network_tcp3;

import java.net.*;
import java.io.*;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		
		System.out.println("Server Start");
		try {
			ss = new ServerSocket(9000); // 0 ~ 1023: 약속(예약)된 포트. 사용 금지
			s = ss.accept(); // client socket. 응답 대기
			
			// I / O 
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			String message = "Hello, Client?";
			os.write(message.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
