package b04_배열;

import java.util.Scanner;

public class backjun1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		double[] ar = new double[n];		
		
		int max = 0; //가장 큰 값을 정해놓는 위치
		double sum=0, maxScore; //평균 값을 구할 총값,최대값 변수 
		for(int i=0; i<ar.length; i++) { //배열 길이만큼 for문돌려 배열 원소 초기화
			ar[i] = sc.nextInt();
			if(ar[max]<ar[i])  //if로 배열 원소 비교
				max=i; //가장 큰 값을 가진 위치를 max에 저장.
			}
			
			maxScore = ar[max]; //max변수값에 최대값을 옮긴다
			for(int i=0; i<ar.length; i++) {
				ar[i] = ar[i]/maxScore*100;
				sum += ar[i]; //변수에 바뀐값들을 더해간다
				
				
			}
			
			System.out.println(sum/n);
			
			
		}

	}

