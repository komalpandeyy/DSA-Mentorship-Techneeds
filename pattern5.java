package assignment2;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int tot = 1;
		int ts = n/2;
		while(rows<=n) {
			
			int cnt_sp = 0;
			while(cnt_sp<ts) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt = 0;
			while(cnt<tot) {
				System.out.print("* ");
				cnt++;
			}
			
			if(rows<=n/2) {
				ts--;
				tot+=2;
			}
			else {
				ts++;
				tot-=2;
			}
			System.out.println();
			rows++;
		}
	}

}
