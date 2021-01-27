package org.javaprogrammingclass;

public class First_Letter_Of_Words_To_Be_Captial {
	
	public static void main(String[] args) {
		
		String name = "welcome to java class", res = "";

		String[] sp = name.split(" ");

	for (String x : sp) {
		
		char c = x.charAt(0);
		
		res = res + Character.toUpperCase(c) +x.substring(1) + " ";
	}

		System.out.println("Character Reverse for each Word: " + res);

	}

}
