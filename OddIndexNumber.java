package com.xworkz.controlStatements;

public class OddIndexNumber {

	public static void main(String[] args) {
		int num[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < num.length; i++) 
			if (num[i] % 2 != 0) {

				System.out.println("odd index number is =" + i);

			}

	}
}


