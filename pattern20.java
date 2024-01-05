package assignment2;

import java.util.Scanner;

public class pattern20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int tot = n;
		int rows = 1;
		while(rows<=n) {
			
			int cnt = 0;
			int i = 1;
			while(cnt<tot) {
				if(cnt==0||cnt==n-1) {
					System.out.print("* ");
					i++;
				}
				
				else if(rows>(n/2)&&(rows==cnt+1||rows+cnt==n)) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
				
				cnt++;
			}
			
			System.out.println();
			rows++;
		}
	}


}
