package b04_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class backjun10807 {
//실패
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//int arr[] = new int[n];//첫쨋줄 정수의 갯수 n개
		
		int cnt = 0;	
	
//		for(int i=0; i<n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//		
		int v = Integer.parseInt(br.readLine()); 
		
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(st.nextToken()) == v) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
		
		

	}

}
