package ex05.network_tcp4;

import java.io.*;
import java.net.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket server = null; // socket 1
		Socket client = null; // socket 2
		System.out.println("연결됨 - 서버");
	
		try {
			server = new ServerSocket(9999);
			client = server.accept();
			
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); // 네트워크 통해 데이터 읽기
			stin = new BufferedReader(new InputStreamReader(System.in)); // 키보드로부터 입력 스트림
			
			// 클라이언트로 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			
			while (true) {
				inputMessage = br.readLine(); // 클라이언트에서 한 행의 문자열을 읽음
				if (inputMessage.equalsIgnoreCase("exit")) break; // 클라이언트가 exit보내면 종료
				
				System.out.println(inputMessage); // 클라이언트가 보낸 메시지 화면 출력
				
				String outputMessage = stin.readLine(); // 키보드에서 한 행의 문자열 읽음.
				bw.write(client.getInetAddress() + " 서버 > "+outputMessage+"\n"); // 키보드에서 읽은 문자열 전송
				bw.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				client.close();
				// server.close();
			} catch (Exception e2) {
				System.out.println("클라이언트와 채팅 중 오류 발생");
			}
		}
	}
}
