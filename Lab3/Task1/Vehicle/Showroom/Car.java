package Vehicle.Showroom;
import java.util.*;

 public class Car extends vehicles
{
	public Car(int s , int g ,int m)
	{
		super(s,g,m);
	}
	
 public String toString()
 {
	 System.out.println("Car:-\nGear = "+super.getgear()+"\nSpeed = "+super.getspeed()+"\nModel = "+super.getmodel());
	return null;
 }
}