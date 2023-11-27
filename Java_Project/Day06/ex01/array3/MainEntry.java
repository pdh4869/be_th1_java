package ex01.array3;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 
		int[][][] a = new int[2][2][3]; //[면][행][열]
		
		// 2.
		int[][][] a2 = new int[][][] {{{1,2,3},{4,5,6}}, {{1,2,3},{4,5,6}}};
		
		// 3. 
		int[][][] a3 = {{{1,2,3},{4,5,6}}, {{1,2,3},{4,5,6}}};
		
		System.out.println("면길이: "+a3.length);
		System.out.println("행길이: "+a3[0].length);
		System.out.println("행길이: "+a3[0][0].length);
		System.out.println("행길이: "+a3[1][0].length);
		System.out.println();
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				for (int k=0;k<3;k++) {
					System.out.print(a3[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}
}
