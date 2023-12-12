package ex02.network_chat;

import java.io.*;
import java.net.*;
import java.util.*;

// collection, thread, io
public class TcpMultiChatServer {
	HashMap clients;
	
	public TcpMultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	public void start() {
		ServerSocket ss = null; // server socket 1
		Socket s = null; // client socket 
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 시작. 채팅 준비 완료");
			
			while (true) {
				s = ss.accept();
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s);
				thread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendToAll(String message) {
		Iterator it = clients.keySet().iterator();
		
		while (it.hasNext()) {
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());
				//System.out.println(dos.toString());
				dos.writeUTF(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	class ServerReceiver extends Thread {
		Socket s;
		DataInputStream dis;
		DataOutputStream dos;
		
		public ServerReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() { // 스레드 실행부(구현부)
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("#"+name+"# 입장");
				
				//System.out.println(dos.toString().hashCode());
				clients.put(name,dos);
				System.out.println("현재 서버 접속자 수: "+clients.size());
				
				while (dis != null) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sendToAll("#"+name+"# 퇴장");
				clients.remove(name); // 접속자 수 제거
				System.out.println("["+s.getInetAddress()+":"+"] 에서 접속 종료");
				System.out.println("현재 접속자 수: "+clients.size());
			}
		}
		
	}
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}
