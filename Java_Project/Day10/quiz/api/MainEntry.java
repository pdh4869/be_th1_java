package quiz.api;

public class MainEntry {
	public static void main(String[] args) {
		String str = "abcDEFGHeijwEIMPYmnqr";
		String[] s = str.split("");

		
		for (int i=0;i<s.length;i++) {
			if (s[i].charAt(0) >= 97) {
				System.out.println(s[i].toUpperCase());
			} else {
				System.out.println(s[i].toLowerCase());
			}
		}
		
	}
}
