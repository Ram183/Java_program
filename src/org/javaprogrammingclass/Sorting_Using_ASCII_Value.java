package org.javaprogrammingclass;

public class Sorting_Using_ASCII_Value {

	/*
	 * A-Z ------ 65 - 90
	 * 
	 * a-z ------ 97 - 122
	 * 
	 * 0-9 ------ 48 - 57
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String nam = "Greens";

		char[] c = nam.toCharArray();

		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c.length; j++) {

				if (c[i] < c[j]) {

					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}
			}
		}

		System.out.println("After Sorting");

		for (char x : c) {

			System.out.print(x + " ");

		}

	}

}
