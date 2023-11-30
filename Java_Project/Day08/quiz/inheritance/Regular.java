package quiz.inheritance;

public class Regular extends Employee {
	int num, salary;
	String name, dept, phone;
	
	public Regular(int num, String name, String dept, String phone, int salary) {
		super(num, name, dept, phone);
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
		this.salary = salary;
		System.out.println("Regular 5개 생성자");
	}
	
	public Regular(int num, String name, String phone, int salary) {
		super(num, name, phone);
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		System.out.println("Regular 4개 생성자");
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("사번: "+num+", 이름: "+name+", 부서: "+dept);
		System.out.println("연락처: "+phone+", 급여: "+salary+"만원");
	}
}
