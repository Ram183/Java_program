package org.javaprogrammingclass;

public class String_Int_Class {

	public static void main(String[] args) {

		String a = "123456789";

		String rev = "";

		int n = Integer.parseInt(a);

		for (int i = a.length() - 1; i >= 0; i--) {

			char s = a.charAt(i);

			rev = rev + s;
		}

		System.out.println(rev);

	}

}
