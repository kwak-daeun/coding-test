package b01_입출력과사친연산;

import java.util.Scanner;

public class backjun09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		int C=scanner.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
		
	}

}
