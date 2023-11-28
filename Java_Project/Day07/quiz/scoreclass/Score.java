package quiz.scoreclass;

public class Score {
	int kor, eng, com, total;
	double avg;
	char grade;
	
	
	public Score() {
		kor = 70;
		eng = 70;
		com = 70;
	}
	
	public Score(int kor, int eng, int com) {
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
	
	public Score(int total, double avg) {
		this.total = total;
		this.avg = avg;
		
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
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
	
	public void display() {
		System.out.println("국어: "+kor+", 영어: "+eng+", 전산: "+com);
		System.out.println("총합: "+total+", 평균: "+String.format("%.2f", avg)+", 학점: "+grade);
	}
	
}
