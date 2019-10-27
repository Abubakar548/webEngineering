import java.util.*;
interface StudentData{

public void setName(String s);
public void setRollNumber(String s);
public void setCGPA(double x);
public String getName() ;
public String getRollNumber();
public double getCGPA(); 
public void display();

}


class Student implements StudentData{

String Name = " ";
String RollNumber = " ";
double CGPA = 0;

public void setName(String s)
{
	Name = s;
}
public void setRollNumber(String s)
{
	RollNumber = s;
}

public void setCGPA(double x)
{
	CGPA = x;
}

public String getName()
{
	return Name;
}
public String getRollNumber()
{
	return RollNumber;
}
public double getCGPA()
{
	return CGPA;
} 
public void display()
{
	System.out.println ("Name : "+ getName());
	System.out.println ("RollNumber : " + getRollNumber() );
	System.out.println ("CGPA : "+ getCGPA());
}


}