package com.xworkz.controlStatements;

public class RoadTax {

	public static void main(String[] args) {
		String state="KA";
		if(state=="KA")
		{
			System.out.println("Karnataka RoadTax is Rs:4000");
		}
		else if (state=="AP") {
			System.out.println("Andrapradesh RoadTax is Rs:5000");
		}
		else if (state=="UP") {
			System.out.println("Uttarpradesh RoadTax is Rs:6000");
		}
		else if (state=="TN") {
			System.out.println("TamilNadu RoadTax is Rs:3000");
		}
		else {
			System.out.println("Please enter a state name");
		}
	}
}
