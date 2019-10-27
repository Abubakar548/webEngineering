import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.*;

class AddressBook{

    ArrayList <PersonInfo> book;
    AddressBook()
    {
       book = new ArrayList<PersonInfo>();
       loadPersons();
    } // constructor end
    public void addPerson ()
    {
        String name = JOptionPane.showInputDialog("Enter Name: ");
        
        String address = JOptionPane.showInputDialog("Enter Address: ");
        
        String phoneNum = JOptionPane.showInputDialog("Enter phoneNum: ");

        book.add(new PersonInfo(name , address , phoneNum));

    } // addPerson end

    public int searchPerson (String find)
    {
        for (int i = 0 ; i < book.size() ; i++)
        {
            if(find.equals(book.get(i).name))
			{
				book.get(i).printInfo();
				return i;
			}
        }
        return -1;
    } // searchPerson end
    
    public void deletePerson (String find)
    {
      int index = searchPerson(find);
      book.remove(index);
        
    } // deletePerson end

	public void printAll()
	{
		if(book.size()!=0)
		{
			for (int i = 0 ; i < book.size() ; i++)
			{
			book.get(i).printInfo();
			} // for loop end
		} // if statement end
		else 
			System.out.println("Empty AddressBook");
		
	} // printAll end

    public void loadPersons()
    {
        String tokens[] = null;
        String name , add , ph;
        try{
            FileReader fr = new FileReader ("persons.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line != null)
            {
                tokens = line.split(",");
                name = tokens[0];
                add = tokens[1];
                ph = tokens[2];
                book.add(new PersonInfo (name,add,ph));
                line = br.readLine();
            } // while ends

            fr.close();
            br.close();
        } // try block ends
             catch(IOException ioEx)
             {
             System.out.println(ioEx);
             } // catch block ends
    } // loadPerson ends


    public void savePersons()
    {
        try{
            FileWriter fw = new FileWriter("persons.txt") ;
            PrintWriter pw = new PrintWriter(fw);
            
            String line ;

            for (int i = 0 ; i< book.size();i++)
            {
                line = book.get(i).name + "," + book.get(i).address + "," + book.get(i).phoneNum ; 
                pw.println(line);
            } // for loop ends
            pw.flush();
            pw.close();
            fw.close();
            
            
        } // try block ends
             catch(IOException ioEx)
             {
             System.out.println(ioEx);
             } // catch block ends
    } // savePerson ends

} // class end