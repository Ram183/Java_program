package org.javaprogrammingclass;

public class Fibbonacci_Series {

	public static void main(String[] args) {
		
		int n=5, a=0, b=1;
		
		System.out.println(a);
		
		System.out.println(b);
		
		for (int i = 1; i < n; i++) {
			
			int c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
	
	
}
