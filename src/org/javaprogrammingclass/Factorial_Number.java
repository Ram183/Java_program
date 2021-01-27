package org.javaprogrammingclass;

public class Factorial_Number {

	public static void main(String[] args) {

		int num = 5, res = 1;

		int a = 0, b = 1;

		System.out.println(a);
		System.out.println(b);

		for (int i = 1; i < num; i++) {

			res = res * i;
		}

		System.out.println("Factorial Number: " + res);

	}

}
