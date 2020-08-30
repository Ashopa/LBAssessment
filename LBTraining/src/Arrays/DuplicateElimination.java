package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElimination {

	public static void main(String[] args) {
		
		int a;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter 5 numbers  between 10 amd 100");

		for (int i=0; i < 5; i++) {
			a = scan.nextInt();		
				if ((a >= 10) && (a <= 100)) {
				if (!list.contains(a)) {
					list.add(a);	
				}
			}	
		}
		
		for (int i=0; i < list.size(); i++) {
			System.out.println("Unique values are \n" + list.get(i));
		}
	 scan.close();	
	}

}
