package ex05.api_stringbuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 초기 용량 16
		
		System.out.println(sb.hashCode());
		System.out.println("length               /                 capacity");
		System.out.println(sb.length()+"   /      "+sb.capacity());
		System.out.println();
		
		sb.append("encore");
		System.out.println(sb.length()+"   /      "+sb.capacity());
		System.out.println();
		
		sb.append("1235464123");
		System.out.println(sb.length()+"   /      "+sb.capacity());
		System.out.println();
		
		sb.append("12421341241  24124125215125125");
		System.out.println(sb.length()+"   /      "+sb.capacity());
		System.out.println();
		
		sb.trimToSize();
		System.out.println(sb.length()+"   /      "+sb.capacity());
		System.out.println();
		
		System.out.println(sb.hashCode());
	}
}
