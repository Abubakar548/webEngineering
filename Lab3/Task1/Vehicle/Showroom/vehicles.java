
package Vehicle.Showroom;
import java.util.*;
public class vehicles implements vehicleInterface
{
	
	int speed = 0,gear = 0,model = 0 ;
	
	vehicles(int s , int g ,int m)
	{
		setgear(g);
		setspeed(s);
		setmodel(m);
	}
	
	public void changeGear(int g)
	{
		gear =  gear + g;
		if(gear < 0)
			gear = 0;
	} 
	public void speedUp(int s)
	{
		speed = speed + s;
	}
	public void applyBreaks(int b)
	{
		speed = speed - b;
		if(speed < 0)
			speed = 0;
	} 
	//============================= SETTER
	void setspeed (int s)
	{
		speed = s;
	}
	void setmodel (int m)
	{
		model = m;
	}
	void setgear (int g)
	{
		gear = g;
	}
	//============================= GETTER
	int getspeed ()
	{
		return speed;
	}
	int getmodel ()
	{
		return model;
	}
	int getgear ()
	{
		return gear;
	}




	
}
