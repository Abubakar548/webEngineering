import java.util.*;

import javax.swing.JOptionPane;

class Driver{
    public static void main(String [] args)
    {
        signup su = new signup ();
    
    String inpt  = JOptionPane.showInputDialog(null, "Enter 1 to create a ACCOUNT\nEnter 2 to signin");
    int option = Integer.parseInt(inpt);
    switch(option)
    {
        case 1:
        
        su.createAccount();
        break;
        case 2:
        su.sigin();
        break;

    }


    }
}