package b01_입출력과사친연산;

import java.util.Scanner;

public class backjun10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		System.out.println(n*(m%10));
		System.out.println(n*(m%100/10));
		System.out.println(n*(m/100));
		System.out.println(n*m);
		
		in.close();
			
		

	}

}
