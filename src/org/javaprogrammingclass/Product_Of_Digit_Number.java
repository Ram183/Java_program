package org.javaprogrammingclass;

public class Product_Of_Digit_Number {

	public static void main(String[] args) {

		int num = 225, rem = 0, res = 1;

		while (num > 0) {

			rem = num % 10;
			res = res * rem;
			num = num / 10;

		}

		System.out.println(" Digit Number:  " + res);
	}

}
