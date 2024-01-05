package assignment2;

import java.util.Scanner;

public class pattern16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rows = 1;
		int tot1 = 1;
		int tot2 = 2*n-3;
		int tot3 = 1;
		
		while(rows<=n) {
			
			int cnt1 = 0;
			int num = 1;
			while(cnt1<tot1) {
				System.out.print(num+" ");
				num++;
				cnt1++;
			}
			
			int cnt2 = 0;
			while(cnt2<tot2) {
				System.out.print("  ");
				cnt2++;
			}
			int num2 = rows;
			int cnt3 = 0;
			while(cnt3<tot3) {
				System.out.print(num2+" ");
				num2--;
				cnt3++;
			}
			
			
			if(rows==n-1) {
				tot2-=1;
				//tot1++;
				tot3++;
			}
			else {
				tot2-=2;
				tot1++;
				tot3++;

			}
			System.out.println();
			rows++;
						
		}
	
	}

}
