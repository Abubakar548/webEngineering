import java.util.*;

class PersonInfo{

    String name , address , phoneNum;
    PersonInfo(String n ,String a,String p)
    {
        name = n;
        address = a;
        phoneNum = p;
    } // constructor end
	public void printInfo()
	{
		System.out.println("Name:- "+name+" Address:- "+address+" Phone Number= "+phoneNum);
		
	} // print end
	

} // class end