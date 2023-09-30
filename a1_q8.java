package assignment1;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		// count the no. of digits
		int count = 0;
		int ans = n;
		int num = n;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		while (k > 0) {
			int digit = n % 10;
			ans = (int) (ans / 10 + digit * Math.pow(10, count - 1));
			n = ans;
			k--;
		}
		
		ans = 0;

		while (k < 0) {
			int digit = (int) (n / Math.pow(10, count - 1));
			ans = (int) (n % Math.pow(10, count - 1));
			ans = ans * 10 + digit ;
			n = ans;
			k++;
		}
		System.out.println(ans);

	}

}
