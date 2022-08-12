package com.bl.basic_core_programs;

public class SwapTwoNum {
	
	public static void main(String[] args) {
 
        int x = 16, y = 24;
 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}