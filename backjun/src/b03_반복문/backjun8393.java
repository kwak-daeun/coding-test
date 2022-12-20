package b03_반복문;

import java.util.Scanner;

public class backjun8393 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum=0;
		
		
		for(int i=1; i<=n; i++) {
			sum = sum+i;
			
		}
		System.out.println(sum);
	}

}
