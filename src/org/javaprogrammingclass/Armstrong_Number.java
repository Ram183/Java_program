package org.javaprogrammingclass;

public class Armstrong_Number {

	public static void armStrongClass(int num) {

		int n = num, res = 0, rem = 0;

		while (num > 0) {

			rem = num % 10;

			res = res + (rem * rem * rem);

			num = num / 10;
		}

		if (n == res) {
			System.out.println("It's a Armstrong Number: " + n);
		} else {
			System.out.println("It's not an Armstrong Number: " + n);
		}

	}

	public static void main(String[] args) {

		armStrongClass(153);
		armStrongClass(123);
		armStrongClass(222);
		armStrongClass(370);

	}

}
