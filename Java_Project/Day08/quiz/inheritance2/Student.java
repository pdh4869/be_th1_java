package quiz.inheritance2;

public class Student extends Person {
	int score;
	public Student(String name, String gender, int age, int score) {
		super(name, gender, age);
		this.name = name;
		this.name = gender;
		this.age = age;
		this.score = score;
	}
	
	public void display() {
		System.out.println("이름: "+name+", 성별: "+gender+", 나이: "+age);
		System.out.println("점수: "+score);
	}
}
