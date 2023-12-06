package ex01.collection.list;

public class Customers {
	protected String name, address, tel;

	Customers() {}
	
	public Customers(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void display() {
		System.out.println("이름: "+name);
		System.out.println("주소: "+address);
		System.out.println("연락처: "+tel);
	}
}
