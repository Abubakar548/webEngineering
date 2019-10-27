import java.util.*;

class Square extends Shape{
	
double width = 0, length = 0,height = 0;

Square (double w , double l , double h)
{
	width = w ;
	length = l;
	height = h;
}

public void calculateArea ( )
{
 super.area = length*width;	
}

public void calculateVolume ( )
{
 super.volume = length*width*height;	
}

}