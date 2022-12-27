package b04_배열;

import java.util.Scanner;

public class backjun8958 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		String str; //문자열 선언
		for(int i=0; i<t; i++) {
			str = in.next();
			
			int sum=0, cnt=0; //총점수, 연속된 O문자를 cnt변수 선언, 초기화
			for(int j=0; j<str.length(); j++) {//문자열이 0~80이내 문자열, length사용 
				if(str.charAt(j) == 'O')//str문자열에서 해당 인덱스 자리 문자 하나 빼온다는 뜻
				{
					cnt++; //o이면 cnt값을 증가시킨다
					sum+= cnt; //sum에 더해준다
				}
				else 
					cnt = 0;
				}
				
				System.out.println(sum);
					
				
			}
		}
	}


