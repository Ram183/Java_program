package org.javaprogrammingclass;

public class Seperate_UpperCase_LowerCase_Digits_SpecialCharacter {

	public static void main(String[] args) {

		String name = "GreensTechnologyChennai29@gmail.com";

		String upper = " ", lower = " ", digits = " ", special = " ";

		int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0;

		char[] ch = name.toCharArray();

		for (char c : ch) {

			if (c >= 65 && c <= 90) {

				upperCount++;
				upper = upper + c;

			} else if (c >= 97 && c <= 122) {

				lowerCount++;
				lower = lower + c;
			} else if (c >= 48 && c <= 57) {

				digitCount++;
				digits = digits + c;

			} else {

				specialCount++;
				special = special + c;
			}

		}

		System.out.println("UpperCase: " + upper + " "+"\t" + " Count: " + upperCount);
		System.out.println("LowerCase: " + lower + " "+"\t" + " Count: " + lowerCount);
		System.out.println("Digits: "    + digits + " "+"\t" + " Count: " + digitCount);
		System.out.println("Special Char: " + special + " "+"\t" + " Count: " + specialCount);

	}

}
