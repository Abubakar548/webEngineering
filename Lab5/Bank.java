import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

class Bank{

    ArrayList <PersonInfo> accounts ;
    
    Bank()
    {
        accounts = new ArrayList <PersonInfo> ();
        loadSample();
    }

    //search
    int search(String accNo)
    {
        for(int i = 0 ; i <accounts.size();i++)
        {
            if(accounts.get(i).accNo.equals(accNo) )
            {
                return i;
            }
        }
        return -1;
    }


    // addNew Record
    void addNewRecord(String name , String accNo , String pcode )
    {
        if(search(accNo) == -1)
        {
        PersonInfo e = new PersonInfo (name , accNo ,pcode);
        accounts.add(e);
        }
        else
        System.out.println("User with that account number already Exsist");
    }

    // TRANSFER
    void transfer(String senderAcc , String recieveAcc , float amount)
    {
        int key1 =search(senderAcc);
        int key2 =search(recieveAcc);
        
        if(key1 < 0)
        {
            System.out.println("Sender Not Found");
        }
        if(key2 < 0)
        {
            System.out.println("Reciever not found");
        }
        else
        {
        accounts.get(key1).withdraw(amount);
        accounts.get(key2).deposit(amount);
        }

    }


        
    public void loadSample()
    {
        String tokens[] = null;
        String name , accNo ;
        int  amount ;
        try{
            FileInputStream fr = new FileInputStream("sample.txt");
            ObjectInputStream ois = new ObjectInputStream(fr);
            
            PersonInfo line =(PersonInfo) ois.readObject();
            while(line != null)
            {
            accounts.add(line);
            line = (PersonInfo)ois.readObject();
            } // while ends

            fr.close();
            ois.close();
        } // try block ends
             catch(FileNotFoundException ioEx)
             {
             System.out.println(ioEx);
             } // catch block ends
             
             catch(ClassNotFoundException ioEx)
             {
             System.out.println(ioEx);
             } // catch block ends

             
             catch(Exception ioEx)
             {
             System.out.println(ioEx);
             } // catch block ends
             
    } // loadPerson ends


    public void saveSample()
    {
        try{
            
            FileOutputStream fw = new FileOutputStream("sample.txt") ;
            ObjectOutputStream oos = new ObjectOutputStream(fw);
            
            for (int i = 0 ; i < accounts.size();i++)
            {
                accounts.get(i).printPerson();
                oos.writeObject(accounts.get(i));
            } // for loop ends
            oos.close();
            fw.close();
            
            
        } // try block ends
        catch(FileNotFoundException ioEx)
        {
        System.out.println(ioEx);
        } // catch block ends
        
        
        catch(Exception ioEx)
        {
        System.out.println(ioEx);
        } // catch block ends
        
        
    } // savePerson ends


} // class Ends

