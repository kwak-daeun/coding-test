package b04_배열;

import java.util.Scanner;

public class baekjun4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]  arr; //점수 배열 선언
		
		int C = sc.nextInt(); //테스트 케이스의 갯수
		
		for(int i=0; i<C; i++) {
			
			int N = sc.nextInt(); //학생수
			arr = new int[N];
			
			//성적 합계
			double sum =0;
			
			//성적 입력
			for(int j=0; j<N; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum+= score;
			}
			
			double avg = (sum/N);
			//평균 넘는 학생수
			double count = 0; 
			
			for(int j=0; j<N; j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
		
		

	}

}
