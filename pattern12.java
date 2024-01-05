package assignment2;

import java.util.Scanner;

public class pattern12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int t = 1;
		int a = 0;
		int b = 1;
		while(rows<=n) {
			int ct = 0;
			while(ct<t) {
				System.out.print(a+" ");
				ct++;
				int c = a;
				a = b;
				b = a+c;
			}
			
			t++;
			System.out.println();
			rows++;
		}
	}

}
