package org.javaprogrammingclass;

public class Swapping_Without_Temp {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before Swapping: ");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = b + a;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}
}
