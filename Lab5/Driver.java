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
        input = JOptionPane.showInputDialog("Enter 1 for New Record\nEnter 2 to Transfer Funds\nEnter 3 to Show Data & EXIT");
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
             while(accNo.length() != 8)
             {
                accNo = JOptionPane.showInputDialog("Enter 8 Digit account number");
            
             }
             pcode = JOptionPane.showInputDialog("Enter Pin Code for Add Record ");
            bank.addNewRecord(name,accNo,pcode);
            break; // case 1 end

            case 2:
            
             String senderAcc = JOptionPane.showInputDialog("Enter Account Number of Sender for Transaction");
             while(senderAcc.length() != 8)
             {
                senderAcc = JOptionPane.showInputDialog("Enter 8 Digit account number");
            
             }
             String recieverAcc = JOptionPane.showInputDialog("Enter Account Number of Reciever for Transaction");
             while(recieverAcc.length() != 8)
             {
                recieverAcc = JOptionPane.showInputDialog("Enter 8 Digit account number");
            
             }
             amount = Float.parseFloat(JOptionPane.showInputDialog("Enter Ammount for Trancsaction "));
            bank.transfer(senderAcc, recieverAcc, amount);
            break; // case 2 end

            

        } // swtich case end
    }//while loop
     bank.saveSample();
    } // main function

} // class end
