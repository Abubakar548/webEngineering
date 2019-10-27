import java.util.*;

class Sphere extends Shape{
	
double radius = 0;


Sphere (double r)
{
	radius =  r;
}

public void calculateArea ( )
{
 super.area = 3.14*radius*radius;	
}

public void calculateVolume ( )
{
 super.volume = 3.14*radius*radius;	
}

}