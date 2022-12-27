package b06_문자열;

import java.util.Scanner;

public class backjun11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next(); //공백없이 한줄로 입력>문자열로 받기!
		
		int sum =0;
	
		for(int i=0; i<n; i++) {
			sum += a.charAt(i) -'0'; //문자를 숫자로 형변환 !
		}
		
		System.out.print(sum);

	}

}
