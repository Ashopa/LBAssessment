package ControlStatementsPart2;

import java.util.Scanner;

public class SalesCalculator {

	public static void main(String[] args) {
		
	double productPrice=0, totalRetail=0;
	int productNumber, quantitySold;
	
	while (true) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Product Number");
		productNumber = scan.nextInt();
		
		if (productNumber > 5) {
			System.out.println("Product number entered is invalid");
			break;
		}
		
		System.out.println("Enter the Product Quantity Sold");
		quantitySold = scan.nextInt();		
				
	switch (productNumber) {
		case 1:
			productPrice = 2.98;
			break;
		case 2:	
			productPrice = 4.50;
			break;
		case 3:
			productPrice = 9.98;
			break;
		case 4:
			productPrice = 4.49;
			break;
		case 5:
			productPrice = 6.87;
			break;			
		}
	
	System.out.println("Price for the Product" + productNumber + " is $" + productPrice);	
	totalRetail = productPrice * quantitySold;
	System.out.println("Total retail amount for the " + quantitySold + " products sold - $" + totalRetail);
	scan.close();
		}	
	}
}
