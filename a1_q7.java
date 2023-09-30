package assignment1;

import java.util.Scanner;

public class q7 {
	
	//Inverse of a number
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int face = 1;
		int inverse = 0;
		while(n>0) {
			
			int digit = n%10;
			inverse+= (int) (face*Math.pow(10, digit-1));
			face++;
			n = n/10;
			
			
		}
		System.out.println(inverse);
	}

}
