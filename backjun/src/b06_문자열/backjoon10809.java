package b06_문자열;

import java.util.Scanner;

public class backjoon10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]  = new int[26]; //알파벳이 해당하는 배열만들기, 갯수만큼!!	
		for(int i=0; i<26; i++) { //배열을 -1로 초기화
			arr[i] = -1;
		}
		
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			int index = s.charAt(i) -'a';
			//단어의 문자값에 해당하는 인코딩값을 -a하여 인덱스 맞춰준다
			if(arr[index] == -1) { 
				//인덱스에 해당하는 배열위치가 -1인지 확인
				arr[index] = i;
				//-1이 맞다면 처음등장한 알파벳으로 위치값 지정
			}
			
		}
		
		for(int i=0; i<26; i++) {
		
			System.out.print(arr[i] +" ");
		}
	}
}
