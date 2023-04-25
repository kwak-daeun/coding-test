package stack;

import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String[] args){
    	
    	  Scanner in=new Scanner(System.in);
    	  String answer = "";
          String s=in.nextLine(); 
          
          
          if(s.charAt(0) ==')') 
        	  System.out.println(false);
          
          //stack 자료 구조 사용해서 괄호 문자열의 괄호짝 올바른지 검사
          Stack<Character> stack = new Stack<>();
          
          for(int i=0; i<s.length(); i++){
        	  if(s.charAt(i) =='('){
        		  stack.push('(');
        		  
        	  }else {
        		  if(!stack.isEmpty()) {
        			  stack.pop();
        		  }
        	  }
          }
          
          if(stack.isEmpty()) {
        	  System.out.println(true); //stack이 비어있다면 올바른 괄호 문자열
          }else {
        	  System.out.println(false);
          }
          
          System.out.println(answer);  
      }
  }

    