package org.javaprogrammingclass;

public class Prime_Number {

	public static void main(String[] args) {

		int num = 31;

		boolean res = true;

		if (num == 0 || num == 1) {

			System.out.println("0 and 1 not considered as Prime");
		}

		else {
			for (int i = 2; i < num / 2; i++) {

				if (num % i == 0) {

					res = false;
					break;
				}
			}

			if (res == true) {
				System.out.println("Its a prime Number");
			} else {
				System.out.println("Its not a Prime Number");
			}

		}

	}
}
