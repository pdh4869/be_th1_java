package ex01.operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		int kor=90, eng=88, com=100;
		int sum = (kor + eng + com);
		double avg = (double)sum / 3;
		System.out.println("*** 박대호님의 성적표 ***");
		System.out.print("국어: "+kor+", ");
		System.out.print("영어 "+eng+", ");
		System.out.print("전산: "+com+", ");
		System.out.println("\n총점: "+sum);
		System.out.println(String.format("평균: %.2f",avg));

	}
}

/*
 * public static void main(String[] args) { // 삼항(조건) 연산자: (조건) ? 참 : 거짓; -> 조건이
 * 참이면 앞, 거짓이면 뒤 int x = 10, y = 20; String msg = null; msg = (x > y) ? "bigger"
 * : "smaller"; System.out.println(msg);
 * 
 * int a = 10, b = 20, c = 30, res; res = (a>b) ? a: (b>c) ? b : c;
 * System.out.println(res); //30
 * 
 * // 대입(배정) 연산자: =, +=, -=, *=, /=, >>=, <<= // x = x+y보다 X += y가 걸리는 시간이 훨씬 적음
 * int q = 3, w = 5, result; res = q+w; System.out.println(res); }
 */