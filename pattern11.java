package assignment2;

import java.util.Scanner;

public class pattern11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int t = 1;
		int count = 1;
		while(rows<=n) {
			int ct = 0;
			while(ct<t) {
				System.out.print(count+" ");
				ct++;
				count++;
			}
			
			t++;
			System.out.println();
			rows++;
		}
	}


}
