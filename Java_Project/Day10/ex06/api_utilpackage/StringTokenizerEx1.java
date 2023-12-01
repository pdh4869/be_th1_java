package ex06.api_utilpackage;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("this is a test");
		
		while (st.hasMoreTokens()) { // 다음 요소가 있는지 검사
			System.out.println(st.nextToken()); // split과 유사
		}
		
		StringTokenizer st2 = new StringTokenizer("사과=5|포도=6|귤=9","=|",true);
		while (st2.hasMoreTokens()) { // 다음 요소가 있는지 검사
			String str = st2.nextToken();
			
			if (str.equals("|")) System.out.println("\n");
			else if (str.equals("|")) System.out.println("\n");
			else System.out.println(str);
		}
	
	}
}
