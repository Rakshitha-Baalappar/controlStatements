package com.xworkz.controlStatements;

public class GSTCalculators {

	public static void main(String[] args) {
		int price=30000;
		double taxAmount;
		String typeOfIndustry="edu";
		if(typeOfIndustry=="edu") {
			taxAmount=price*0.1/100;
			System.out.println("Tax amount is" + taxAmount );
		}
		else if (typeOfIndustry=="sales") {
			taxAmount=price*0.8/100;
			System.out.println("Tax amount is" + taxAmount );	
		}
		else if (typeOfIndustry=="health") {
			taxAmount=price*0.12/100;
			System.out.println("Tax amount is" + taxAmount );	
		}
		else if (typeOfIndustry=="manufacture") {
			taxAmount=price*0.15/100;
			System.out.println("Tax amount is" + taxAmount );	
		}
	}
}
