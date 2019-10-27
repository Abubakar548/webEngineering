import java.util.*;
public class Main{
	
	public static void main (String [] args)
	{
		
		System.out.println();
		
		System.out.println("FOR UPcasting Car");
		Vehicle v1 = new Car ();
		v1.move();


		System.out.println();
		
		System.out.println("FOR UPcasting Bike");
		Vehicle v2 = new Bike ();
		v2.move();
		
		
		System.out.println();
		
		System.out.println("FOR DOWNcasting Car");
		Vehicle v3 = new Car ();
		Car c1 = new Car();
		c1 = (Car)v3;
		c1.move();
		
		System.out.println();
		
		System.out.println("FOR DOWNcasting Bike");
		Vehicle v4 = new Bike ();
		Bike b1 = new Bike();
		b1 = (Bike)v4;
		b1.move();
		
		
	}
}