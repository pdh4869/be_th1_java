package ex01.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

import ex01.collection.list.Customers;

public class CustomerManager extends Customers {
	ArrayList<Customers> list = new ArrayList<Customers>();

	CustomerManager() {}
	
	CustomerManager(String name, String address, String tel) {
		Customers c = new Customers(name, address, tel);
		list.add(c);
	}
	
	public void CustomerAdd(String name, String address, String tel) {
		Customers c = new Customers(name, address, tel);
		list.add(c);
	}
	
	public void CustomerAdd(	) { // 입력하여 추가
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: "); name = sc.next();
		System.out.print("주소: "); address = sc.next();
		System.out.print("연락처: "); tel = sc.next();
		
		Customers c = new Customers(name, address, tel);
		list.add(c);
	}
	
	public void CustomerRemove(int i) { // 인덱스로 삭제
		System.out.println("\n\n* 삭제된 고객");
		list.get(i-1).display();
		System.out.println("---------------------");
		list.remove(i-1);
	}
	
	public void CustomerChange(int i, String name, String address, String tel) {
		Customers c = new Customers(name, address, tel);
		list.set(i-1,c);
	}
	
	public void display() {
		System.out.println("저장된 고객 수: "+list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println();
			System.out.println("- "+(i+1)+"번 - ");
			list.get(i).display();
		}
	}
}
