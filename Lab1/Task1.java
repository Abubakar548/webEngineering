import java.util.Scanner;
class Task1{

public static void main (String [] arg)
{

System.out.print("Enter number of rows: ");
Scanner input = new Scanner(System.in);
int rows = input.nextInt();
int [] value = new int [rows];
//initializing values
for(int i = 0 ; i<rows ; i++)
{
	value[i] = 0;
}

//taking values
for(int i = 0 ; i<rows ; i++)
{
	value[i] = input.nextInt();

}

	System.out.println();
// printing values
for (int i = 0  ; i < rows ; i++)
{
	for(int j = 0 ; j <= i ; j++)
	{
		System.out.print(value[j]+ "  ");
	}
	System.out.println();
}	

}

}