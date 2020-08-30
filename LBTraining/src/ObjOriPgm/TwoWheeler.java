package ObjOriPgm;

public class TwoWheeler extends Vehicle{
	
	public void wheels () {
		int wheelCount = 2;
		System.out.println(wheelCount);
	}
	
	public static void main(String[] args) {

		Vehicle obj1 = new Vehicle ();
		
		obj1.speed();
		
		TwoWheeler obj2 = new TwoWheeler ();
		
		obj2.wheels();
		
	}

}
