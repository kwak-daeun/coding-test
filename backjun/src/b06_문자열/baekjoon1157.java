package b06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[26];
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			if('a' <=s.charAt(i) && s.charAt(i) <= 'z') {
				//대문자 범위
				arr[s.charAt(i) - 97]++;
			}else { //소문자범위
				arr[s.charAt(i) - 65]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int i=0; i<26; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
				ch = (char)(i+65); //대문자 출력해야하므로 65더한다
				
			}
			else if (arr[i] ==max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		

	}

}
