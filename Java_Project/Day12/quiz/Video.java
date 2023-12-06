package quiz;

import java.util.Date;

public class Video {
	String title, category, lendName;
	char lendYN;
	Date lendDate;
	
	Video() {}
	
	public Video(String title, String category, String lendName, char lendYN, Date lendDate) {
		super();
		this.title = title;
		this.category = category;
		this.lendName = lendName;
		this.lendYN = lendYN;
		this.lendDate = lendDate;
	}
	
	public void display() {
		System.out.println("비디오 제목: "+title);
		System.out.println("장르: "+category);
		System.out.println("대여자: "+lendName);
		System.out.println("대여 여부: "+lendYN);
		System.out.println("대여일: "+lendDate);
	}
	
	
			
}
