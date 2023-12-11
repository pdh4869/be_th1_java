package ex03.io.data;

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("memo.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);
		dos.writeShort(100);
		dos.writeInt(1249);
		dos.writeLong(125159358);
		dos.writeFloat(23.59f);
		dos.writeDouble(20.387);
		dos.flush(); // 버퍼 비우기
		
		System.out.println("memo.txt 파일에 "+ dos.size()+"byte save");
		dos.close();
	}
}
