package Vehicle.Showroom;
import java.util.*;
public class Bike extends vehicles
{
	public Bike(int s , int g ,int m)
	{
		super(s,g,m);
	}
	
	
 public String toString()
 {
	 System.out.println("BIKE:-\nGear = "+super.getgear()+"\nSpeed = "+super.getspeed()+"\nModel = "+super.getmodel());
	 return null;
 }
}