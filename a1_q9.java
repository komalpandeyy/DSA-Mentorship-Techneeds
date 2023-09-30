package assignment1;

import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		// gcd and lcm

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int divident = n1;
		int divisor = n2;

		// finding gcd
		// long divison method
		int rem = divident % divisor;
		while (rem > 0) {
			divident = divisor;
			divisor = rem;
			rem = divident % divisor;
		}

		System.out.println("GCD IS " + divisor);

		int lcm = 1;
		// now finding lcm
		if (n1 > n2) {
			lcm = n1;
		} else {
			lcm = n2;
		}

		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println("LCM is "+ lcm);
				break;
			}
			lcm++;
		}
	}

}
