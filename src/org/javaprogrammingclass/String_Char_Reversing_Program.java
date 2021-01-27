package org.javaprogrammingclass;

public class String_Char_Reversing_Program {

	public static void main(String[] args) {

		String name = "welcome to java class", res = "";

		String[] sp = name.split(" ");

		for (String x : sp) {

			String rev = " ";

			for (int i = x.length()- 1; i >= 0; i--) {

				rev = rev + x.charAt(i);
			}

			res = res + " " + rev;
		}

		System.out.println("Character Reverse for each Word: " + res);

	}

}
