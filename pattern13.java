package assignment2;

import java.util.Scanner;

public class pattern13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int t = 1;
		int count = 1;
		while(rows<=n) {
			int ct = 0;
			while(ct<t) {
				if(ct==0||ct==t-1) {
					System.out.print(1+" ");
				}
				else if(rows == n&&ct ==n/2) {
					System.out.print((ct+1)*2+" ");
				}
				else {
					System.out.print(rows-1+" ");
				}
				ct++;
				
			}
			count++;
			t++;
			System.out.println();
			rows++;
		}
	}

}
