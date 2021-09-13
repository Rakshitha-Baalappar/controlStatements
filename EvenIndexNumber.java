package com.xworkz.controlStatements;

public class EvenIndexNumber {

	public static void main(String[] args) {
		int num[] = { 5, 6, 7, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < num.length; i++)
			if (num[i] % 2 == 0) {

				System.out.println("Even Index Number is =" + i);

			}

	}

}
