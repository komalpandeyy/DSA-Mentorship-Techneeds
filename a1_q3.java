package assignment1;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t>0) {
		int n = scn.nextInt();
		//checking for prime no.s
		int count = 0;
		int div = 2;
		while(div<n) {
			if(n%div == 0) {
				count++;
			}
			div++;
		}
		if(count>0||n==1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
		
		t--;
	}

}
}
