package assignment2;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int t = 1;
		int ts = n-1;
		while(rows<=n) {
			
			int cs = 0;
			while(cs<ts) {
				System.out.print("  ");
				cs++;
			}
			
			int ct = 0;
			while(ct<t) {
				System.out.print("* ");
				ct++;
			}
			
			
			
		
			ts--;
			System.out.println();
			rows++;
		}
	}


}
