package ControlStatementsPart2;

public class Factorial {

	public static void main(String[] args) {
		
		int i;
		long x = 1, n=20;
		System.out.println("Number " + "\t" + "Factorial of the number" + "\n");
		
		for (i=1; i<=n; i++) {	
			x = x * i ;
			System.out.println(i + "\t" + x + "\n");
		}
	
	}

}
