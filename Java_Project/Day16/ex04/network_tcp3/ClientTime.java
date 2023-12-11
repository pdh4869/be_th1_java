package ex04.network_tcp3;

import java.net.*;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;

public class ClientTime {
	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		int port = 7000;
		
		Date date = null;
		String str = null;
		try {
			Socket s = new Socket(serverIP, port);
			InputStream is = s.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			System.out.println("Server측 날짜/시간 확인 - 클라이언트");
			str = (String)ois.readObject();
			System.out.println("현재 서버측 시간: "+date+ "입니다.");
			ois.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
