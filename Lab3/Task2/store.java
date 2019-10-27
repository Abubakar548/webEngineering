import java.util.*;
class store
{
	int [] arr;
	int size = 0;
	
	store(int s)
	{
		size = s;
		arr = new int [s];
	}
	
	
 public void Store()	
 {
	 int index = 0 ,value = 0;
	 Scanner s = new Scanner (System.in);
	 
	 System.out.println("Enter index you want to store:- ");
	 index = s.nextInt();
	 if(index > size && index < 0)
		 throw new Exception();
	 System.out.println("Enter Value you want to store:- ");
	 value = s.nextInt();
	 arr[index] = value;
	 
 }
 public void Print()
 {
	 for(int i = 0 ; i < size ; i++)
	 {
		 System.out.print(" "+arr[i]);
	 }
 }

}