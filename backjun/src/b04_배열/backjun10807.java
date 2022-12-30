package b04_배열;

import java.util.Scanner;

public class backjun10807 {
//실패
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int cnt = 0;	
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] ==v) {
				cnt++;
			}
			
			System.out.println(cnt);
		}
		

	}

}
