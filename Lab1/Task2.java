import java.util.Scanner;
class Task2{

public static void main (String [] arg)
{

System.out.print("Enter number of rows: ");
Scanner input = new Scanner(System.in);
int rows = input.nextInt();
int [] value = new int [rows];
for(int i = 0 ; i<rows ; i++)
{
	value[i] = 0;
}


for(int i = 0 ; i<rows ; i++)
{
	value[i] = input.nextInt();

}

int countOdd = 0 , countEven = 0 ;
for(int i = 0 ; i<rows ; i++)
{
	if(value[i]%2 == 0)
		countEven ++;
	else 
		countOdd ++;
}


System.out.println("Count of Even Numbers: " + countEven);

System.out.println("Count of Odd Numbers: " + countOdd);



}

}