package b03_반복문;

import java.util.Scanner;

public class backjun10950 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A+B);
		}

	}

}
