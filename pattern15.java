package assignment2;

import java.util.Scanner;

public class pattern15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int rows = 1;
		int t = 1;
		int count = 1;
		int ts = n / 2;
		while (rows <= n) {
			int cs = 0;
			while (cs < ts) {
				System.out.print("  ");
				cs++;
			}

			int ct = 0;
			// count = rows;
			while (ct < t) {
				System.out.print(count + " ");
				// count++;
				ct++;
				if (ct <= t/2) {
					count++;
				} else {
					count--;
				}
			}

			System.out.println();
			if (rows <= n / 2) {
				rows++;
				ts--;
				t += 2;
				count = rows;

			} else {
				rows++;
				ts++;
				t -= 2;
				count = n - rows + 1;

			}
		}
	}

}
