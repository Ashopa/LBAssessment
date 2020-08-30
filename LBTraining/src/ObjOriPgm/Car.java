package ObjOriPgm;

public class Car extends Vehicle {
	
	public void wheels () {
		int wheelCount = 4;
		System.out.println(wheelCount);
	}
	
	public static void main(String[] args) {

		Vehicle obj = new Vehicle ();
		
		obj.speed();
		
		Car obj1 = new Car ();
		
		obj1.wheels();
		
	}
}	
