import Vehicle.Showroom.*;
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Bike bike = new Bike(80,4,70);
		bike.toString();
		
		Car car = new Car(200,6,2000);
		car.toString();
		
		Truck truck = new Truck(150,5,1200);
		truck.toString();
	}
	

}