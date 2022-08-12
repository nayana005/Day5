package com.bl.basic_core_programs;

public class LargestNum {
	
	public static void main(String[] args) {

		double n1 = 10, n2 = 16, n3 = 24;

		if(n1 >= n2) {
			if(n1 >= n3)
				System.out.println(n1 + " is the largest number.");
			else
				System.out.println(n3 + " is the largest number.");
		} else {
			if(n2 >= n3)
				System.out.println(n2 + " is the largest number.");
			else
				System.out.println(n3 + " is the largest number.");
		}
	}
}
