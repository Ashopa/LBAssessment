package ControlStatementsPart1;

import java.util.Scanner;

public class SalaryCalculator {
	
	double grossPay=0;
	static double workedHours=0;
	static double payPerHour=0;
	double extraHourRate = 1.5;
	static String employeeName;
	
	public void grossPay (double workedHours,double payPerHour) {
		
		if (workedHours <= 40) {
			grossPay = workedHours * payPerHour;
		}
		else {
			grossPay = ( 40 * payPerHour ) + ( workedHours - 40 * extraHourRate );
		}
		System.out.println("Gross Pay of " + employeeName + " is " + grossPay);
	}
	
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Employee Name : ");
		employeeName = scan.next();
		
		System.out.println("Enter the Worked Hours per day : ");
		workedHours = scan.nextDouble();
		
		System.out.println(+ workedHours);

		System.out.println("Enter the Pay amount per hour : ");		
		payPerHour = scan.nextDouble();
		
		SalaryCalculator pay = new SalaryCalculator();
		pay.grossPay(workedHours,payPerHour);		
		
		scan.close();
	}	

}
