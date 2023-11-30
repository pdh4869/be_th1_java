package quiz.inheritance2;

public class Person {
	String name,gender;
	int age;
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("이름: "+name+", 성별: "+gender+", 나이: "+age);
	}
}
