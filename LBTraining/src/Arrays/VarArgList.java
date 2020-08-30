package Arrays;

public class VarArgList {

	public static int product(int...nums) {
		
		int product = 1;
		for (int i=1; i < nums.length; i++) {
			product  *= nums[i];
		}
		
		return product;
	}

	public static void main(String[] args) {
		
		int a= 10, b=20,c=30,d=40,e=50;
		
		System.out.println("5 integers are \n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
		
		System.out.println("The product of a and b integers " + product(a, b));
		
		System.out.println("The product of a, b, c integers " + product(a, b, c));
		
		System.out.println("The product of a, b, c, d integers " + product(a, b, c, d));
		
		System.out.println("The product of a, b, c, d, e integers " + product(a, b, c, d, e));
		
	}

}
