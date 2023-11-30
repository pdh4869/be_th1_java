package ex02.abstract2;

public class MainEntry {
	public static void main(String[] args) {
		new Circle().show("원");
		new Triangle().show("삼각형");
		new Rectangle().show("사각형");
		
		Shape[] ss = new Shape[3];
		ss[0] = new Circle();
		ss[1] = new Triangle();
		ss[2] = new Rectangle();
		
		String[] name = {"Circle", "Triangle", "Rectangle"};
		
		for (int i=0;i<ss.length;i++) {
			ss[i].show(name[i]);
		}
		System.out.println();
	}
}
