package assignment1;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();
		
		int n = low;
		while(n<=high) {
			//checking for prime no.s
			int count = 0;
			int div = 2;
			while(div<n) {
				if(n%div == 0) {
					count++;
				}
				div++;
			}

			if(count == 0 && n>1) {
				System.out.println(n);
			}
			
			n++;
		}
		
		
	}

}
