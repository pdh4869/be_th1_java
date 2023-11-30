package quiz.scoreclass;

import java.util.Scanner;

public class Score1 {
	int kor, eng, com, total;
	double avg;
	char grade;
	
	public Score1(int kor, int eng, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.total = kor+eng+com;
		this.avg = total/3.0;
		
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		this.grade = grade;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getTotal() {
		return kor+eng+com;
	}
	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("국어 입력: ");
		kor = s.nextInt();
		System.out.print("영어 입력: ");
		eng = s.nextInt();
		System.out.print("전산 입력: ");
		com = s.nextInt();
	}
	public void display() {
		System.out.println("국어: "+kor+", 영어: "+eng+", 전산: "+com);
		System.out.printf("총점: %d, 평균: %.2f, 학점: %c",total,avg, grade);
	}
}
