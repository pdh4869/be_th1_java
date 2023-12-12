package ex03.network_udp1;

import java.io.*;
import java.util.*;
import java.net.*;

public class DatagramClient {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		int port = 8000;
		String str;
		byte[] buffer = null;
		
		try {
			System.out.println("UDP File Client");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("전송 대상 (Server IP): ");
			String ipAddress = br.readLine();
			System.out.print("전송 파일 (파일명.확장자): ");
			String fileName = br.readLine();
			
			File file = new File(fileName);
			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(-1);
			}
			str = "start";
			buffer = str.getBytes();
			ds = new DatagramSocket();
			InetAddress iaddress = InetAddress.getByName(ipAddress); // 문자열 ip를 실제 ip주소로
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp); // 송신
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			buffer = new byte[65536];
			
			while (true) {
				int count = dis.read(buffer, 0, buffer.length);
				if (count == -1) break;
				
				dp  = new DatagramPacket(buffer, count, iaddress, port);
				ds.send(dp);
			}
			
			str = "end";
			buffer = str.getBytes();
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
