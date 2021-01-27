package org.javaprogrammingclass;

public class Java_Program_Sum_Program {

	public static void main(String[] args) {

		int sum = 0;

		int num = 10;

		for (int i = 0; i <= num; i++) {

			if (i % 2 == 0) {

				System.out.println(i + " is Even Number");
				sum = sum + i;
			} else {
				System.out.println(i + " is Odd Number");
			}
		}
		
		System.out.println("Sum of Number: " + sum);
	}

}
