package b03_반복문;


import java.util.Scanner;

public class backjun25304 {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt(); //총합
		int n = in.nextInt(); //총개수
		
		for(int i=0; i<n; i++) {
			int a = in.nextInt();
			int b= in.nextInt();
			 
			x = x- a*b;
		}
		
		if(x==0) {
			System.out.println("Yes");
		}else {
				System.out.println("No");
			}
		}
	}

	
