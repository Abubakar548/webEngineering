import java.util.*;
class Task4{

public static void main (String [] args)
{
	int x = new Integer(args[0]).intValue() ;

	fibonacci(x);
}

static void fibonacci (int count)
{
	int x = 1 ,temp = 0 ;
	int f = 0;
	if(count == 2)
	System.out.print("0 1");
    else if(count == 1)
	{
		System.out.print("0");
	}
	else if(count == 0)
	{
		
	}
	else
	{
		
	System.out.print("0 1");
	for(int i = 2 ; i <= count ; i++)
	{
		
		f = x+temp;
		temp = x;	
		x = f;
	System.out.print(" " + f);
	}
	}
}

}