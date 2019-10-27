import java.util.*;
class driver
{
public static void main(String [] args)
{

	try	{	
	
	
	Scanner input = new Scanner (System.in);
	 
	 System.out.println("Enter size of array :- ");
	 int size = input.nextInt();
	 
	store s = new store(size);
int option = 0;
while(option != 3)
{
	
	 System.out.println("1. Add Values");
	 System.out.println("2. Print all values");
	 System.out.println("3. Exit");


	 option = input.nextInt();
     if(option == 1)
	 s.Store();
	else if (option == 2)
	 s.Print();
    else if (option == 3)
	 option = 3;
	else
		System.out.println("Wrong Option");

}
	}
	
	 catch(Exception e)
	 {
		 System.out.println(e+" Which is out of your Index Range ");
		 
	 }
}

}