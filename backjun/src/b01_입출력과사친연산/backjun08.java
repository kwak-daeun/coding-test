package b01_입출력과사친연산;

import java.util.Scanner;

public class backjun08 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int 킹 = in.nextInt();
		int 퀸 = in.nextInt();
		int 룩 = in.nextInt();
		int 비숍 = in.nextInt();
		int 나이트 = in.nextInt();
		int 폰 = in.nextInt();
		
		System.out.print(킹 + 1 + " ");
		System.out.print(퀸 - 1 + " ");
		System.out.print(룩 - 2 + " ");
		System.out.print(비숍 - 2 + " ");
		System.out.print(나이트 - 2 + " ");
		System.out.println(폰 - 6 + " ");
		
		
		int king = in.nextInt();
		int queen = in.nextInt();
		int look = in.nextInt();
		int beeshop = in.nextInt();
		int night = in.nextInt();
		int phone = in.nextInt();
		
		System.out.print(king - 3 + " ");
		System.out.print(queen - 1 + " ");
		System.out.print(look - 1 + " ");
		System.out.print(beeshop + " ");
		System.out.print(night - 2 + " ");
		System.out.println(phone + 6 + " ");
		
		
	}

}
