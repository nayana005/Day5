package com.bl.basic_core_programs;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		if(n>0&&n<32){
			for(int i=1;i<=n;i++){
				System.out.println(i+" "+Math.pow(2,i));
			}
		}else{
			System.out.println("overflow");
		}
		sc.close();
	}

}
