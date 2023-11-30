package quiz.inheritance;

public class Sales extends Regular {
	int num, salary;
	double comm;
	String name, dept, phone;
	
	public Sales(int num, String name, String phone, int salary) {
		super(num, name, phone, salary);
		this.num = num;
		this.name = name;
		this.dept = "영업";
		this.phone = phone;
		this.salary = salary;
		this.comm = salary * 0.3;
	}

	public void display() {
		System.out.println("사번: "+num+", 이름: "+name+", 부서: "+dept);
		System.out.println("연락처: "+phone+", 급여: "+salary+"만원"+", 인센티브: "+comm+"만원");
	}
}
