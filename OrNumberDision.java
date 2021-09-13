package com.xworkz.controlStatements;

public class OrNumberDision {

	public static void main(String[] args) {
		int num[] = { 5, 8, 10, 15, 56, 20, 25, 45, 30, 35, 40, 88, 45, 50, };
		for (int i = 0; i < num.length; i++)
			if (num[i] % 3 == 0 || num[i] % 4 == 0) {

				System.out.println("Division of 3 OR 4 is = " + num[i]);

			}

	}

}
