package ex02.network_tcp1;

import java.io.*;
import java.net.*;

public class GetAllByNameEx2 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("로컬 호스트 이름: "+address.getHostName());
		System.out.println("로컬 호스트 IP 주소: "+address.getHostAddress());
		System.out.println();
		
		address = InetAddress.getByName("www.en-core.com");
		System.out.println("로컬 호스트 이름: "+address.getHostName());
		System.out.println("로컬 호스트 IP 주소: "+address.getHostAddress());
		System.out.println();
		
		byte[] addr = new byte[4];
		addr[0] = (byte)192;
		addr[1] = (byte)168;
		addr[2] = (byte)0;
		addr[3] = (byte)48;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("로컬 호스트 이름: "+address.getHostName());
		System.out.println("로컬 호스트 IP 주소: "+address.getCanonicalHostName());
		System.out.println("로컬 호스트 IP 주소: "+address.getHostAddress());
		System.out.println();
		
		InetAddress[] arr = InetAddress.getAllByName("www.google.com");
		
		for (InetAddress i : arr) {
			System.out.println("로컬 호스트 이름: "+i.getHostName());
			System.out.println("로컬 호스트 IP 주소: "+i.getHostAddress());
			System.out.println();
		}
		
		System.out.println("로컬 호스트 이름: "+address.getHostName());
		System.out.println("로컬 호스트 IP 주소: "+address.getCanonicalHostName());
		System.out.println("로컬 호스트 IP 주소: "+address.getHostAddress());
		System.out.println();
		
		
	}
}
