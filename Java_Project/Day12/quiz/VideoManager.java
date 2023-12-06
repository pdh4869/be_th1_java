package quiz;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class VideoManager extends Video {
	HashMap<Integer, Video> video = new HashMap();
	
	VideoManager() {}
	
	VideoManager(String title, String category, String lendName, char lendYN, Date lendDate) {
		Video v = new Video(title, category, lendName, lendYN, lendDate);
		video.put(1, v); 
	}
	
	public void add(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.print("비디오 제목: "); title = sc.next();
		System.out.print("장르: "); category = sc.next();
		System.out.print("대여자: "); lendName = sc.next();
		System.out.print("대여여부: "); lendYN = sc.next().charAt(0);
		lendDate = new Date();
		Video v = new Video(title, category, lendName, lendYN, lendDate);
		video.put(i, v);
	}
	
	public void remove(int i) {
		System.out.println("\n\n * 삭제된 고객 * ");
		video.get(i-1).display();
		System.out.println("-----------------------");
		video.remove(i-1);
	}
	
	public void change(int i, String title, String category, String lendName, char lendYN, Date lendDate) {
		 Video v = new Video(title, category, lendName, lendYN, lendDate);
		 video.replace(i-1, v);
	}
	
	public void print() {
		System.out.println("인수: "+video.size());
		for (int i=0;i<video.size();i++) {
			System.out.println();
			System.out.println(" - "+(i+1)+"번 - ");
			video.get(i).display();
		}
	}
	
}
