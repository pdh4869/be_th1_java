package ex01.collection.set;

import java.lang.*; // 자동 임포트
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person { // extends Object (자동)
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public int hashCode() {
		return name.hashCode() + age;
		// return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) { // 비교(부모 연산자로 변환이 되는지 검사)
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	
	
}

public class HashSetEx3 {
	public static void main(String[] args) {
		Person p = new Person("dh", 26);
		Set set = new HashSet();
		set.add(p);
		
		set.add(new Person("dh", 22));
		set.add(new Person("dh", 24));
		set.add(new Person("dh", 22));

		
		System.out.println(set); // String 특성때문에 name 중복
		
		A a = new A();
		B b = new B();
		A bb = new B();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
		
	}
}

class A {
	String name;
}

class B extends A {

}
