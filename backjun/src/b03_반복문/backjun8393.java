package b03_반복문;

import java.util.Scanner;

public class backjun8393 {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			sum = sum+i;
			
		}
		System.out.println(sum);
	}

}
