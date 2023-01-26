package b06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekjoon2941  {
	
	public static void main(String[] args) throws IOException {
		
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	//크로아티아 문자들을 배열로 만들기
	String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
	for(int i=0; i<str.length; i++) {
		if(s.contains(str[i])) {
			s = s.replace(str[i], "0"); //문자열로 바꾸는것 replace
			}
		}
	
		System.out.println(s.length());
	}
	
	
	
	}
