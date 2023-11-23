package quiz2;

public class ForStar {
	public static void main(String[] args) {
		// 정사각형
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (i <= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		// 
		for (int i=1;i<=5;i++) {
			for (int j=5;j>i;j--) {
				System.out.print(' ');
			}
			for (int j=i;j>=1;j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (j >= i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
		// 5.
				System.out.println();
				
				for (int i=1;i<=5;i++) {
					for (int j=i;j<5;j++) {
						System.out.print(' ');
					}
					for (int j=1;j<=(2*i)-1;j++) {
						System.out.print('*');
						
					}
					System.out.println();
				}
				
				// 6.
						
					for (int i=4;i>=1;i--) {
						for (int j=5;j>i;j--) {
							System.out.print(' ');
						}
						for (int j=(2*i)-1;j>=1;j--) {
							System.out.print('*');
						}
						System.out.println();
					}
					
					
		
	}
}
