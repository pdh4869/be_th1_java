package ex01.arraymethod;

public class MainEntry {
	public static void line() {
		System.out.println("-------------------------------------------");
	}
	
	public static int methodEx(int x, int y) {
		return x+y;
	}
	
	public static int[] methodEx2() {
		int[] a = {1,2,3,4,5,6,7,8};
		return a;
	}
	
	public static int[][] methodEx3() {
		int[][] arr = {{1,2,3,4}, {5,6,7,8}};
		return arr;
	}
	
	
	public static void main(String[] args) {
		int x=3, y=5;
		int res = methodEx(x,y);
		int[] arrRes = methodEx2();
		int[][] arrRes2 = methodEx3();
		System.out.println(res);
		line();
		
		
		for (int i=0;i<arrRes.length;i++) {
			System.out.print(arrRes[i]+" ");
		}
		System.out.println();
		line();
		
		
		int sum=0;
		for (int i=0;i<arrRes2.length;i++) {
			for (int j=0;j<arrRes2[0].length;j++) {
				System.out.print(arrRes2[i][j] + " ");
				sum += arrRes2[i][j];
			}
			System.out.println();
		}
		line();
		
		System.out.println("sum: "+sum);
		line();
		
		// foreach로 2차원배열 출력
		for (int[] i : arrRes2) {
			for (int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		line();
		
		int index = 0;
		for (int [] item : arrRes2) {
			System.out.println("index: "+index++);
			System.out.println(item); // 주소 
			System.out.println(item.hashCode()); // 해시값
		}
	}
}
