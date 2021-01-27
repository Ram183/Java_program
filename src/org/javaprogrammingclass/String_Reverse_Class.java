package org.javaprogrammingclass;

public class String_Reverse_Class {

	public static void main(String[] args) {

		String name = "Selenium";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			char c = name.charAt(i);
			rev = rev + c;

		}

		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {

			rev = rev + ch[i];

		}
		System.out.println("Reverse String Value: " + rev);

	}

}
