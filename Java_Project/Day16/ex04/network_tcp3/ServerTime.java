package ex04.network_tcp3;

import java.net.*;
import java.io.*;
import java.util.*;

public class ServerTime {
	public static void main(String[] args) {
		int port = 7000;
		try {
			System.out.println("Server Start");
			ServerSocket ss = new ServerSocket(port);
			
			while (true) {
				Socket s = ss.accept();
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject("dhpark"+new Date());
				oos.flush();
				s.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
