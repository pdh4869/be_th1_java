package ex05.io.fileobject;

import java.io.*;

public class FileObjectLoad {
	public static void main(String[] args) {
		String name, id, pwd, temp, phone;
		int age = 0;
		boolean gender = true;
		name = id = pwd = temp = phone = null;
		
		File f = new File("members.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			
			name = (String)ois.readObject();
			id = (String)ois.readObject();
			pwd = (String)ois.readObject();
			gender = (Boolean)ois.readObject();
			age = (Integer)ois.readObject();
			phone = (String)ois.readObject();
			
			System.out.println("\t\t\t --- 회원정보 ---\n");
			System.out.println("name \t ID \t PWD \t Gender \t Age \t PhoneNumber");
		
			System.out.print(name+"\t"+id+"\t"+pwd+"\t");
			
			if (gender == true) System.out.print("남자");
			else System.out.print("여자");
			
			System.out.println("\t"+age+"\t"+phone);
			
		} catch (Exception e) {
			
		}
	}
}
