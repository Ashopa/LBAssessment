package Methods;

import java.util.Scanner;

public class TempratureConversion {
	
	double fahrenheit, celsius;
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		String tempScale;	
			
		System.out.println("Enter the Temperature Scale option (Celsius/Fahrenheit) - ");
		tempScale = scan.next();		
		TempratureConversion obj = new TempratureConversion();

		switch (tempScale.toLowerCase()) {
			case "celsius":
			obj.celsius();
			break;
			case "fahrenheit" :
			obj.fahrenheit();
			break; 
		default:
			System.out.println("Invalid Option");
			break;
		}
	}	
	
	public void celsius() {
		System.out.println("Enter the Temperature in Celsius to convert in Fahrenheit");
		celsius = scan.nextDouble();		
		fahrenheit = 9.0 / 5.0 * (celsius + 32);
		System.out.println("Temperature from Celsius to Fahrenheit - " + fahrenheit + "°F");
	}
	
	public void fahrenheit() {
		System.out.println("Enter the Temperature in Fahrenheit to convert in Celsius");
		fahrenheit = scan.nextDouble();		
		celsius = 5.0 / 9.0 * (fahrenheit - 32);
		System.out.println("Temperature from Fahrenheit to Celsius - " + celsius + "°C");
	}
}
