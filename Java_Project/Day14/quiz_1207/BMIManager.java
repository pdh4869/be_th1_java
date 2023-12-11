package quiz_1207;

import java.util.*;
import java.io.*;

public class BMIManager extends BMI {
	ArrayList<BMI> bmi = new ArrayList<BMI>();
	double BMI = weight / ((height / 100) * (height / 100));
	
	BMIManager() {}
	
	BMIManager(double height, double weight, char gender) {
		BMI b = new BMI(height, weight, gender);
		bmi.add(b);
	}
	
	public void add() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("키: "); height = Double.parseDouble(br.readLine());
		System.out.print("몸무게: "); weight = Double.parseDouble(br.readLine());
		System.out.println("성별: "); gender = br.readLine().charAt(0);
		BMI b = new BMI(height, weight, gender);
		bmi.add(b);
	}
	
	public void delete(int i) {
		System.out.println("\n\n* 삭제된 정보");
		bmi.get(i - 1).display();
		System.out.println("--------------");
		bmi.remove(i - 1);
	}
	
	public void print() {
		double BMI;
		BMI = weight / ((height / 100) * (height / 100));
		
		for (int i=0;i<bmi.size();i++) {
			System.out.println();
			System.out.println("-- "+(i+1) + "번 -- ");
			bmi.get(i).display();
			System.out.println("BMI: "+BMI);
			
			if (BMI >= 25.0) {
				System.out.println("비만");
			} else if (BMI >= 23.0 && BMI <= 24.9) {
				System.out.println("과체중");
			} else if (BMI >= 18.5 && BMI <= 22.9) {
				System.out.println("정상 체중");
			} else {
				System.out.println("저체중");
			}
		}
	}
	
	public void modify(int i) {
		BMI b = new BMI(height, weight, gender);
		bmi.set(i-1, b);
	}
	
	public void makeFile() throws IOException {
		File f = new File("BMI.txt");
		FileOutputStream fos = new FileOutputStream(f,true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(bmi);
		System.out.println(f+"saved");
	}
	
	public void readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("BMI.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<BMI> bb = (ArrayList<BMI>)ois.readObject();
		System.out.println(bb);
	}
}
