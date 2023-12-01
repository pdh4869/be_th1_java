package ex05.api_stringbuffer;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(0, "Hi, ");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
