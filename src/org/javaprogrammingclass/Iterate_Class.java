package org.javaprogrammingclass;

public class Iterate_Class {
		
	public static void main(String[] args) {
		
		int num = 16543;
		
		int rem =0, rev=0;
		
		while (num>0) {
			
			rem = num % 10;
			rev = (rev*10)+rem;
			num = num/10;
			}
		
			System.out.println("reversing value: " + rev);
		}
	}


