package assignment1;

import java.util.Scanner;

public class q10 {
	//prime factorization
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int div = 2;
		//int num = n;
		while(div<=n) {
			
			if(n%div == 0) {
				System.out.print(div+"  ");
				n = n/div;
			}
			else {
				div++;
			}
			
			
		}
	}

}
