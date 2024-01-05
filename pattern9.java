package assignment2;

import java.util.Scanner;

public class pattern9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		while(rows<=n) {
			
			int ct = 0;
			while(ct<n) {
				if(ct==rows-1||ct==n-rows) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				ct++;
			}

			System.out.println();
			rows++;
		}
	}


}
