package com.bl.basic_core_programs;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if(num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}
}

