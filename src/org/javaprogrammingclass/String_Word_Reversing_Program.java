package org.javaprogrammingclass;

public class String_Word_Reversing_Program {

	public static void main(String[] args) {

		String name = "welcome to java class";

		String res = "";

		String[] sp = name.split(" ");

		for (int i = sp.length - 1; i >= 0; i--) {

			res = res + " " + sp[i];

		}

		System.out.println("String Reverse Value will be: " + res);

	}

}
