import java.util.*;

abstract class Shape{
	
double area = 0;
double volume = 0;

public String toString ( )
{
 String s = "Area = " + area+ "\nVolume = " + volume;
 return s;
 }

public abstract void calculateArea ( );

public abstract void calculateVolume ( );

}
