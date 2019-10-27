import java.util.*;

abstract class Shape{
	
double area = 0;
double volume = 0;

public String toString ( )
{
 System.out.println ("Area = " + area);
 System.out.println ("Volume = " + volume);
 return null;
 }

public abstract void calculateArea ( );

public abstract void calculateVolume ( );

}