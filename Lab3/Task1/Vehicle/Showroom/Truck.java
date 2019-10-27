package Vehicle.Showroom;
import java.util.*;
public class Truck extends vehicles
{
	public Truck(int s , int g ,int m)
	{
		super(s,g,m);
	}
	
 public String toString()
 {
	 System.out.println("Truck:-\nGear = "+super.getgear()+"\nSpeed = "+super.getspeed()+"\nModel = "+super.getmodel());
	return null;
 }
}
