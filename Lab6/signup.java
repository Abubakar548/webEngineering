import java.util.*;
import java.sql.*;

import javax.swing.JOptionPane;

class signup{

    void createAccount()
    {
    try{
           
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/lab6";
    Connection con=DriverManager.getConnection(url,"root","admin");
    Statement st=con.createStatement();

	Scanner inp = new Scanner(System.in);

	System.out.print("Please enter First Name: ");
	String f_name = inp.nextLine();
        
	System.out.print("Please enter Last Name: ");
	String l_name = inp.nextLine();
        
	System.out.print("Please enter password: ");
	String pass = inp.nextLine();

	System.out.print("Please enter Email: ");
	String address = inp.nextLine();

	System.out.print("Please enter gender: ");
	String gender= inp.nextLine();
	
	System.out.print("Please enter dob: ");
	String dob = inp.nextLine();


     String query="insert into info(f_name,l_name,pass,address,gender,dob) values('"+f_name+"','"+l_name+"', '"+pass+"', '"+address+"', '"+gender+"' , '"+dob+"' )";

     int rs = st.executeUpdate( query );

	 System.out.println(rs);
   
     if(rs > 0){
        System.out.println("Record inserted successfully.");
	  }
     
     else{
    	 System.out.println("Record could not inserted.");
         }


         con.close();

        } //try
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            
        }

    }// createAccount

 




void sigin()
{
try{
       
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://127.0.0.1/lab6";
Connection con=DriverManager.getConnection(url,"root","admin");
Statement st=con.createStatement();

Scanner inp = new Scanner(System.in);

System.out.print("Please enter Email: ");
String address = inp.nextLine();

System.out.print("Please enter password: ");
String pass = inp.nextLine();


 String query="select * from info where address = '"+address+"' and pass = '"+pass+"' ";

 ResultSet rs = st.executeQuery( query );

 if(rs.next()){
    String email = rs.getString("address");
        String pwd = rs.getString("pass");
        if(email.equals(address) && pass.equals(pwd))
        {
            System.out.println("Sign In successfull");
            
        String inpt  = JOptionPane.showInputDialog(null, "Enter 1 to update Info");
        int option = Integer.parseInt(inpt);
            if(option == 1)
            {
                updateProfile(email);
            }
        }

  }
 
 else{
     System.out.println("Sign IN UNSUCCESSFULL");
     }

    } //try
    catch(SQLException ex)
    {
        System.out.println(ex);
    }
    catch(Exception ex)
    {
        System.out.println(ex);
        
    }

}// signin

void updateProfile(String email)
{

    


    try{
           
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/lab6";
        Connection con=DriverManager.getConnection(url,"root","admin");
        Statement st=con.createStatement();
    
        Scanner inp = new Scanner(System.in);
    
        System.out.print("Please enter First Name: ");
        String f_name = inp.nextLine();
            
        System.out.print("Please enter Last Name: ");
        String l_name = inp.nextLine();
            
        System.out.print("Please enter password: ");
        String pass = inp.nextLine();
        
        System.out.print("Please enter gender: ");
        String gender= inp.nextLine();
        
        System.out.print("Please enter dob: ");
        String dob = inp.nextLine();
    
    
         String query="update info set f_name = '"+f_name+"', l_name = '"+l_name+"', pass = '"+pass+"', gender = '"+gender+"' , dob =  '"+dob+"'  where address= '" +email+ "' ";
    
         int rs = st.executeUpdate( query );
    
         System.out.println(rs);
       
         if(rs > 0){
            System.out.println("Record updated successfully.");
          }
         
         else{
             System.out.println("Record could not updated.");
             }
    
    
             con.close();
    
            } //try
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
                
            }
    


















}


}









