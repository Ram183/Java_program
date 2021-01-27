package org.javaprogrammingclass;

public class Integer_To_String {

	public static void main(String[] args) {

		int a = 12345;

		String res = "";

//		String str = Integer.toString(a);

//			    (OR)

		String num = String.valueOf(a);

		for (int i = num.length() - 1; i >= 0; i--) {

			char c = num.charAt(i);

			res = res + c;

		}

		System.out.println("String Reverse Value: " + res);
		
	}

}
