import java.util.*;

import javax.swing.JOptionPane;
class Main{
public static void main (String [] args)
{
    AddressBook aBook = new AddressBook();
    String input;
    int option = 0;
    while ( option != 5 )
    {
        input = JOptionPane.showInputDialog("Enter 1 to add Person Info\nEnter 2 to search Person Info\nEnter 3 to delete Person Info\nEnter 4 to Print All info\nEnter 5 to exit");
        try
		{
		option = Integer.parseInt(input);
		}
		
		catch(NumberFormatException e)
		{
			option = 0;
			System.out.println("Only Numbers are allowed\nNote:-Donot use Aplhabets or Special Characters");
		} // catch block end
		
	    switch (option) {
            case 1:
                aBook.addPerson();
                break;
            case 2:
            
                input = JOptionPane.showInputDialog("Enter Person name to search in Address Book\n");
                if(aBook.searchPerson(input) == -1)
                {
                    System.out.println("Person not found!");
                }
                else
                    System.out.println("Person is found!");
                break;
            case 3:
                input = JOptionPane.showInputDialog("Enter Person name you want to remove\n");
                aBook.deletePerson(input);
				break;
			case 4:
				aBook.printAll();
				break;
		} // switch case
    
    } // while loop
    
    aBook.savePersons();
    System.out.println("Book file updated");
} // main end

} // class end