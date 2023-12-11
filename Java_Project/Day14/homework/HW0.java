package homework;

import java.io.*;
import java.util.ArrayList;

public class HW0 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> stack = new ArrayList();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0;i<n;i++) {
			String a[] = br.readLine().split(" ");
			
			switch (Integer.parseInt(a[0])) {
			case 1:
				stack.add(Integer.parseInt(a[1]));
				break;
			case 2:
				if (stack.size() >= 1)
					System.out.println(stack.remove(stack.size()-1));
				else
					System.out.println(-1);
				break;
			case 3:
				System.out.println(stack.size());
				break;
			case 4:
				if (stack.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case 5: 
				if (stack.size() > 0) {
					System.out.println(stack.get(stack.size()-1));	
				} else {
					System.out.println(-1);
				}
			}
		}
		br.close();
	}
}
