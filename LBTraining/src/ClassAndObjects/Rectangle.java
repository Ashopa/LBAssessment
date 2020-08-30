package ClassAndObjects;

import java.util.Scanner;

public class Rectangle {
	
	static float length = 1;
	static float width = 1;
	
	public void setLength(float length) {
		if (length > 0.0 || length < 20.0) {
			Rectangle.length =  length;
		}
		else {
			 throw new IllegalArgumentException ("For input length:0.0");
		}
	}
	
	public float getLength() {
		return length;
	}

	public void setWidth(float width) {
		if (width > 0.0 || width < 20.0) {
			Rectangle.width = width;
		}
		else {
			throw new IllegalArgumentException("For input width:0.0");
		}
	}
	
	public float getWidth() {
		return length;
	}
	
	 public double getPerimeter()
     {
         return (length + width)*2 ;
     }
      
     public double getArea()
     {
         return length * width ;
     }
	
	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle ();
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Length of the Rectangle");
		length = scan.nextFloat();
		
		System.out.println("Enter the Width of the Rectangle");
		width = scan.nextFloat();
		
		obj.setLength(length);
		obj.setWidth(width);
		
		System.out.println("Rectangle Length - " + obj.getLength() + "\nRectangle Width - " + obj.getWidth());
		System.out.println("Rectangle Area - " + obj.getArea() + "\nRectangle Perimeter - " + obj.getPerimeter());
	}
}
