package assignment2;

import java.util.Scanner;

public class pattern19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int tot = n;
		int rows = 1;
		while(rows<=n) {
			
			int cnt = 0;;
			while(cnt<tot) {
				if(cnt==n/2||rows==(n/2)+1) {
					System.out.print("* ");
				}
				else if(rows==n&&cnt>n/2) {
					System.out.print("* ");
				}
				else if((rows<=n/2&&cnt>n/2&&cnt!=n-1)||(rows<=n/2&&cnt!=n-1&&rows!=1)) {
					System.out.print("  ");
				}
				else if((rows>n/2&&cnt!=0)){
					System.out.print("  ");
				}
	
				else {
					System.out.print("* ");
				}
				
				cnt++;
			}
			
			System.out.println();
			rows++;
		}
	}

}
