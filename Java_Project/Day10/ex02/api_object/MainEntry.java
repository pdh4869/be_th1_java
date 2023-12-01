package ex02.api_object;

class Point { }

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt Information");
		System.out.println("Class Name: "+ pt.getClass());
		System.out.println("hash code: "+pt.hashCode());
		System.out.println("Object String: "+pt.toString());
		System.out.println("Object String: "+pt);
		System.out.printf("10진수 %d\n", 0x782830e);
		System.out.println();
		Point pt2 = new Point();
		System.out.println("Point pt2 Information");
		System.out.println("Class Name: "+ pt2.getClass());
		System.out.println("hash code: "+pt2.hashCode());
		System.out.println("Object String: "+pt2.toString());
		System.out.println("Object String: "+pt2);
		System.out.printf("10진수 %d\n", 0x1b40d5f0);
		System.out.println();
		
		
		System.out.println("pt.toString(): toString() 의미 - ex02.api_object.Point@782830e");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt.hashCode()));
	
		Point pt3 = new Point();
		if (pt.hashCode() == pt3.hashCode()) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		
		Point pt4 = new Point();
		pt4 = pt;
		if (pt.hashCode() == pt4.hashCode()) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		
		System.out.println(pt.hashCode() +", " + pt4.hashCode());
	}
}	
