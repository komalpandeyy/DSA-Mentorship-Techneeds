package assignment2;

import java.util.Scanner;

public class pattern17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rows = 1;
		int tot2 = 1;
		int tot1 = n/2;
		while(rows<=n) {
			
			int cnt1 = 0;
			while(cnt1<tot1) {
				if(rows==(n/2)+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
				cnt1++;
			}
			
			int cnt2 = 0;
			while(cnt2<tot2) {
				System.out.print("* ");
				cnt2++;
			}
			
			
			if(rows>n/2) {
				tot2--;
			}
			else {
				tot2++;
			}
			System.out.println();
			rows++;
						
		}
	
	}
}
