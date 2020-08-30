package Arrays;

import java.util.Scanner;

public class OneDimArray {

	public OneDimArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int i,j,n ;
		
		int array[] = {0,0,0,0,0,0,0,0,0,0};
		for (i = 0; i<10; i++) {
			System.out.println(array[i] + "\n");
		}
		
		int[] arrBonus = new int [15];
		for (i=0; i < arrBonus.length; i++) {
			arrBonus[i]+=1;
			System.out.println("ArrayBonus" + i + " - " +arrBonus[i]);
		}
		
		Scanner scan = new Scanner (System.in);
		n =5;
		System.out.println("Enter any 5 best scores");
		int a[] =new int[n];
		for (i = 0; i<n; i++) {
			a[i] = scan.nextInt(); }
		
		for (j=0; j<a.length; j++) {
			System.out.println("BestScores\n" + a[j] + "\n");
		}
		
		scan.close();
		

	}

}
