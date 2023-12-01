 package ex03.api_string;

class Point {
	int x,y;
}
public class MainEntry {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println("str: "+str);
		
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		
		System.out.println("str: "+str);
		System.out.println("kbs");
		
		String msg = "jasdasfaljf132";
		System.out.println("en-core "+msg);
		System.out.println(msg);
		
		String str2= "abcde".substring(2);
		System.out.println(str2);
		str2 = "abcdefghijklmn".substring(2,5); // 시작값포함 끝값미포함
		System.out.println("----------------------------------------");
		
		String s1 = new String("encore");
		String s2 = new String("encore");
		
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println("p1.hashCode()"+p1.hashCode());
		System.out.println("p2.hashCode()"+p2.hashCode());
		
		String s3 = "seoul";
		String s4 = "seoul";
		
		if (s3 == s4) System.out.println("same");
		else System.out.println("not same");
		System.out.println("----------------------------------------");
		if (s1 == s2) System.out.println("same");
		else System.out.println("not same");
		
		s2 = "kosa";
		System.out.println("s1.hashCode(): "+s1.hashCode());
		System.out.println("s2.hashCode(): "+s2.hashCode());
		s2 = "korea";
		System.out.println("s1.hashCode(): "+s1.hashCode());
		System.out.println("s2.hashCode(): "+s2.hashCode());
		s2 = "encore";
		System.out.println("s1.hashCode(): "+s1.hashCode());
		System.out.println("s2.hashCode(): "+s2.hashCode());
		
		
	}
}
