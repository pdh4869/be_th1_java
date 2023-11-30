package quiz.inheritance;

public class PartTime extends Employee {
	int workDays, perTime;
	
	public PartTime(int num, String name, String dept, String phone,
					int workDays, int perTime) {
		super(num, name, dept, phone);
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
		this.workDays = workDays;
		this.perTime = perTime;	
	}
	
	public void display() {
		System.out.println("사번: "+num+", 이름: "+name+", 부서: "+dept);
		System.out.println("연락처: "+phone+", 급여: "+(workDays*perTime)+"원");
	}

}
