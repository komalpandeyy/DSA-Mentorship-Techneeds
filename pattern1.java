package assignment2;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int tot = 1;
		while(rows<=n) {
			
			int cnt = 0;
			while(cnt<tot) {
				System.out.print("* ");
				cnt++;
			}
			tot++;
			System.out.println();
			rows++;
		}
	}

}
