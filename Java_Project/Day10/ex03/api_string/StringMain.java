package ex03.api_string;

public class StringMain {
	public static void main(String[] args) {
		String s1 = "KirtAngle";
		String s2 = "UNDERTAKER";
		
		System.out.println("s1: "+s1+", s2: "+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.toUpperCase() + " " +s2.toLowerCase());
		System.out.println(s2.replace("R","rrr"));
		
		String s3 = new String("        ab    cd           ");
		System.out.println(s3);
		System.out.println("length: "+s3.length());
		
		s3 = s3.trim();
		System.out.println(s3);
		System.out.println("length: "+s3.length());
		s3 = s3.replace(" ", "");
		System.out.println(s3);
		System.out.println("length: "+s3.length());
		
		
		int[] arr = {1,2,3,4,5};
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String s4 = new String("abc/defgh/k2345/iojaf/218425216");
		String[] s5 = s4.split("/");
		for (int i=0;i<s5.length;i++) {
			System.out.println(s5[i]);
		}
		System.out.println();
		String s6 = "123-4567-8901";
		s5 = s6.split("-");
		for (int i=0;i<s5.length;i++) {
			System.out.println(s5[i]);
		}
		
		System.out.println();
		String s7 = "1234567890abcdef		34567		78f88f8		String";
		char ch = s7.charAt(15);
		System.out.println(ch);
		System.out.println(s7.indexOf('f'));
		System.out.println(s7.lastIndexOf('f'));
		
		System.out.println(s7.substring(3));
	}
}
