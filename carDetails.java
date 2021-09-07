package com.xworkz.controlStatements;

public class carDetails {

	public static void main(String[] args) {
		String carDetails ="tata";
		switch (carDetails){
		case "tata":
			System.out.println("Car name=Nexon");
			System.out.println("Company name=Tata");
			System.out.println("Car kmph=60");
			break;
		case "maruti":
			System.out.println("Car name=Swift");
			System.out.println("Company name=Maruti Suzuki");
			System.out.println("Car kmph=80");
			break;
		case "toyata":
			System.out.println("Car name=Innova");
			System.out.println("Company name=Toyata");
			System.out.println("Car kmph=60");
			break;
		case "Kia":
			System.out.println("Car name=Seltos");
			System.out.println("Company name=Kia");
			System.out.println("Car kmph=60");
			break;
		default: System.out.println("Wrong Car details");
			
			
		}
		

	}

}
