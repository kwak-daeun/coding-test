package b06_문자열;

import java.util.Scanner;


public class baekjoon1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		String[] word_arr = word.split(" ");
		//공백을 기준으로 나눠서 배열에 저장
		
		if(word_arr.length == 0) {
			System.out.println(0);
			System.exit(0);
		}
		if(word_arr[0] == "") {
			System.out.println(word_arr.length -1);
			//배열의 맨앞이 공백이면 단어가 아님 길이 -1
		}else {
			System.out.println(word_arr.length);
		}
		
	}

}
