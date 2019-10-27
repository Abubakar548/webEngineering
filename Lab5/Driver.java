import java.util.*;
import javax.swing.JOptionPane;

class Driver
{
    public static void main(String [] args)
    {

    Bank bank = new Bank ();
    String input;
        int option = 0 ;
     while(option != 3)
     {
        input = JOptionPane.showInputDialog("Enter 1 for New Record\nEnter 2 to Transfer Funds\nEnter 3 to EXIT");
        try
		{
		option = Integer.parseInt(input);
        }
		
		catch(NumberFormatException e)
		{
			option = 0;
			JOptionPane.showMessageDialog(null,"Only Numbers are allowed\nNote:-Donot use Aplhabets or Special Characters");
		} // catch block end
		
        String name , accNo , pcode ;
        float amount = 0;
        switch(option)
        {
            case 1:
             name = JOptionPane.showInputDialog("Enter Name for Add Record ");
             accNo = JOptionPane.showInputDialog("Enter Account Number  for Add Record");
             pcode = JOptionPane.showInputDialog("Enter Pin Code for Add Record ");
             //amount = Float.parseFloat(JOptionPane.showInputDialog("Enter Word for Add Record ")).;
            bank.addNewRecord(name,accNo,pcode);
            break; // case 1 end

            case 2:
            
             String senderAcc = JOptionPane.showInputDialog("Enter Account Number of Sender for Transaction");
             
             String recieverAcc = JOptionPane.showInputDialog("Enter Account Number of Reciever for Transaction");
            
             amount = Float.parseFloat(JOptionPane.showInputDialog("Enter Word for Add Record "));
            
            break; // case 2 end

            

        } // swtich case end
     } // while loop
     bank.saveSample();
    } // main function

} // class end
