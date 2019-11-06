import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

class Driver {

    public static void main(String[] args) {

        University u = new University();

        int option = 1;
        try {

            while (option != 0 && option < 4) {
                String inpt;
                inpt = JOptionPane.showInputDialog(null,
                        "\nEnter 1 to Insert a Data\nEnter 2 to Show Data \nEnter 3 to Delete Data\nAny Key for Exit");
                option = Integer.parseInt(inpt);

                switch (option) {
                case 1:
                    u.insertData();
                    break;
                case 2:
                    u.showAll();
                    break;
                case 3:

                    String roll_number = JOptionPane.showInputDialog(null, "Please enter RollNumber: ");
                    ;

                    u.deleteData(roll_number);
                    break;

                }// Switch case 2

            } // While Loop

        } // try block
        catch (Exception ex) {
            System.out.println(ex);
        }
    }// main funtion
} // driver class