package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		int[] a = new int[10001];
		
		for (int i=0;i<n;i++) {
			a[Integer.parseInt(br.readLine())] += 1;
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<10001;i++) {
			if (a[i] != 0) {
				for (int j=0;j<a[i];j++) {
					sb.append(i).append("\n");
				}
			}
		}
		System.out.println(sb);
		
	}
}
