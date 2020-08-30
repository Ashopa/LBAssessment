package ControlStatementsPart1;

import java.util.Scanner;

public class CreditLimitCalculator {
	
	static int accountNumber, balanceAmount,totalItemsCharged,totalCredits,creditLimit, newBalance;
	 
	public void newBalance (int balanceAmount, int totalItemsCharged, int totalCredits, int creditLimit) {	
		
		newBalance = balanceAmount + totalItemsCharged - totalCredits ;
		System.out.println("New balance for the Account Number " + accountNumber + " - " +newBalance);
		
		if (newBalance > creditLimit) {
			System.out.println("Credit limit exceeded.");
		}
		else {
			System.out.println("Credit limit not exceeded. Thanks for Purchasing");
		}

	}	
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner (System.in); 

		System.out.println("Enter the Account Number : ");
		accountNumber = scan.nextInt();

		System.out.println("Enter the Balance Amount : ");
		balanceAmount = scan.nextInt();		

		System.out.println("Enter the charge for Total Items purchased: ");
		totalItemsCharged = scan.nextInt();

		System.out.println("Enter the credits : ");
		totalCredits = scan.nextInt();
		
		System.out.println("Enter your card Credit Limit : ");
		creditLimit = scan.nextInt();
		
		CreditLimitCalculator obj = new CreditLimitCalculator();
		obj.newBalance(balanceAmount, totalItemsCharged, totalCredits, creditLimit);			
		
		scan.close();
	}
}

