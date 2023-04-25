package b03_반복문;

import java.util.Scanner;
public class Remainder{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in); //scanner를 이용하여 정수 n을 입력 받는다.
      	int n=in.nextInt();        
        int answer = 0; //answer 변수를 선언하고 '0'으로 초기화한다.
        
      	for(int i=1; i<n; i++){ 
          //for 루프를 사용하여 1부터 n-1까지의 숫자를 x로 지정하고, n을 x로 나눈 나머지가 1이 되는 숫자를 찾는다.
     		if(n%i == 1){ //if문을 사용하여 n % i == 1 조건을 만족하는 숫자를 찾는다.
              answer =i; //조건을 만족하는 숫자 i가 찾아지면 answer에 저장  
              break; //break를 이용하여 루프를 종료.
            }
        }
        
        System.out.println(answer);  //마지막으로 answer를 출력
    }
}
