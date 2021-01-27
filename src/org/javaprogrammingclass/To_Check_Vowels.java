package org.javaprogrammingclass;

public class To_Check_Vowels {

	public static void main(String[] args) {

		String name = "GreensTechnologyChennai29@gmail.com";

		String vowels = " ", cons = " ";

		int vowelsCount = 0, consCount = 0;

		char[] ch = name.toCharArray();

		for (char c : ch) {

			if (c >= 65 && c <= 122) {

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
					|| c == 'O' || c == 'u') {

					vowels = vowels + c;
					vowelsCount++;
				} else {

					cons = cons + c;
					consCount++;
				}

			}
		}
		System.out.println("Vowels: " + vowels + " " + "\t" + " Count: " + vowelsCount);
		System.out.println("LowerCase: " + cons + " " + "\t" + " Count: " + consCount);

	}
}
