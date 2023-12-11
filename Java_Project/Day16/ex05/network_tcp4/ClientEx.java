package ex05.network_tcp4;

import java.io.*;
import java.net.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		Socket client = null; // socket 2
		
		try {
			client = new Socket("127.0.0.1", 9999);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			
			while (true) {
				System.out.print("message input: ");
				outputMessage = stin.readLine();
				
				if (outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}
				bw.write(client.getInetAddress() + " 클라이언트 > "+outputMessage+"\n"); // 키보드에서 읽은 문자열 전송
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				client.close();
			} catch (Exception e2) {
				System.out.println("server와 채팅 중 오류 발생");
			}
		}
	}
}
