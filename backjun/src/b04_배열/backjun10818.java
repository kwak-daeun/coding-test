package b04_배열;

import java.util.Arrays;
import java.util.Scanner;

public class backjun10818 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int []arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr); //오름차순 정렬
		System.out.println(arr[0] + " " + arr[n-1]);

	}

}
