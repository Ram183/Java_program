package org.javaprogrammingclass;

public class Sum_Of_Odd_Or_Even_Count {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		int oddCount = 0, evenCount= 0;
		
		for (int i = 0; i < num; i++) {
			
			if (i%2==0) {
				System.out.println(i + " is Even Number");
				evenCount++;
			}else {
				System.out.println(i + " is Odd Number");
				oddCount++;
			}
		}
		
		System.out.println("Total Number of Odd Count: " + oddCount);
		System.out.println("Total Number of Even Count: " + evenCount);
	}

}
