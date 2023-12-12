package ex03.network_udp1;

import java.io.*;
import java.util.*;
import java.net.*;

public class DatagramServer {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataOutputStream dos = null;
		
		int port = 8000;
		String str;
		File file = null;
		
		try {
			System.out.println("UDP file Server");
			ds = new DatagramSocket(port);
			
			while (true) {
				dp = new DatagramPacket(new byte[65536], 65536);
				ds.receive(dp);
				str = new String(dp.getData(), dp.getLength()).trim();
				
				if (str.equals("start")) {
					System.out.println("전송중......");
					file = new File("test.txt");
					dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				} else if (str.equalsIgnoreCase("end")) {
					System.out.println("end");
					break;
				} else {
					System.out.println(str);
					dos.write(dp.getData(), 0, dp.getLength());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
