package assignment1;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		//reverse of a number
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int reverse = 0;
		while(n>0) {
			int rem = n%10;
			reverse = reverse*10+rem;
			n = n/10;
		}
		System.out.println(reverse);
	}

}
