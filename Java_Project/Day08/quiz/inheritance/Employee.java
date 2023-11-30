package quiz.inheritance;

public class Employee {
	int num;
	String name, dept, phone, time;

	public Employee(int num, String name, String dept, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
		System.out.println("Employee 4개 생성자");
	}
	public Employee(int num, String name, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		System.out.println("Employee 3개 생성자");
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

/* Employee <-------- Regular <--------- Sales
 사번, 이름, 부서, 연락처       급여           커미션 
*/