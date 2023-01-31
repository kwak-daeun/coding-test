package b03_반복문;

import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//입력수가 10미만이면 10을 곱함
		if(N<10) {
			N*= 10;
		}
		
		
		int a = 0; //첫째자리수
		int b = 0; //둘째자리수
		int cnt = 0;
		int sum = N;
		
		while(true) {
		a = sum / 10;
		b = sum % 10;
		sum = a+b;
		
		sum = b*10 + sum %10; //10이상 수 나오면 마지막 자리수로 해야하기 때문에
		cnt++;
		if(sum==N) 
			break;
		}
		
		System.out.println(cnt);
	}

}
