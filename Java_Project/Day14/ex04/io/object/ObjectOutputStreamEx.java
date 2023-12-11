package ex04.io.object;

import java.io.*;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Grade vo = new Grade();
		vo.setSubject("미술");
		vo.setScore(90);
		
		System.out.println(vo);
		OutputStream os = new FileOutputStream("grade.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
		os.close();
	}
}
