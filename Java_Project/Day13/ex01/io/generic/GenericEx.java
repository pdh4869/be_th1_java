package ex01.io.generic;

public class GenericEx<T> {
	T[] v;
	
	public void set(T[] v) {
		this.v = v;
	}
	
	public void print() {
		for (T t : v) {
			System.out.println(t);
		}
	}
}
