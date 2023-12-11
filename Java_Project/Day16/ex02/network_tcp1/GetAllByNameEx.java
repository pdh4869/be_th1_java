package ex02.network_tcp1;

import java.io.*;
import java.net.*;

public class GetAllByNameEx {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[] address;
		
		System.out.print("site address: ");
		try {
			strUrl = br.readLine();
			address = InetAddress.getAllByName(strUrl); // 예외발생
			
			for (int i=0;i<address.length;i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
