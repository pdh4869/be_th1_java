package ex02.network_tcp1;

import java.net.*;
public class MainEntry {
	public static void main(String[] args) throws UnknownHostException {
		String host = "127.0.0.1";
		
		InetAddress[] ia = InetAddress.getAllByName(host);
		
		for (InetAddress add : ia) {
			System.out.println(add);
			System.out.println(add.getCanonicalHostName());
		}
	}
}
