package assignment2;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int t = n-2;
		int ts = 1;
		while(rows<=n) {
			int ct = 0;
			while(ct<t) {
				System.out.print("* ");
				ct++;
			}
			
			int cs = 0;
			while(cs<ts) {
				System.out.print("  ");
				cs++;
			}
			
			int ct2 = 0;
			while(ct2<t) {
				System.out.print("* ");
				ct2++;
			}
			
		
			if(rows<=n/2) {
				t--;
				ts+=2;
			}
			else {
				t++;
				ts-=2;
			}
			System.out.println();
			rows++;
		}
	}

}
