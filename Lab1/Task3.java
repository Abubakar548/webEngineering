import java.util.Scanner;

class Task3main
{
	public static void main (String [] arg)
	{
		Task3 obj = new Task3 ();
		obj.sum();
	}
}


class Task3{

int sum ()
 {
 int x = 0 , y = 0,count = 0;
 while(x != -1 && y!= -1)

 {
	 Scanner input = new Scanner(System.in);

 System.out.print("Enter Number 1: ");
 x = input.nextInt();

	if (x == -1 )
	{
	return -1;	
	}
	
 System.out.print("Enter Number 2: ");
 y = input.nextInt();	

	if (y == -1)
	{
	return -1;	
	}
	System.out.println("Sum is " + (x+y));
	count++;
    System.out.println("Operation performed " + count + " times");
 }
 return 0;
 }

}