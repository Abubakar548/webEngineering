import javax.swing.JOptionPane;

class Driver {
    public static void main(String[] args) {
        signup su = new signup();
        int option = 1;
        while (option != 0 && option < 8) {
            String inpt = JOptionPane.showInputDialog(null,
                    "Enter 1 to create a ACCOUNT\nEnter 2 to Sign in\nEnter 3 to Show Data Forward\nEnter 4 to Show Data Backward\nEnter 5 to Show First Data\nEnter 6 to Show Last Data\nEnter 7 to Select Row to Show\nAny Key for Exit");
            option = Integer.parseInt(inpt);

            switch (option) {
            case 1:
                su.createAccount();
                break;
            case 2:
                su.sigin();
                break;
            case 3:
                su.showdataForward();
                break;
            case 4:
                su.showdataBackward();
                break;
            case 5:
                su.showdataFirst();
                break;
            case 6:
                su.showdataLast();
                break;
            case 7:
                su.showdataAbsolute();
                break;

            }// Switch case
        } // While Loop

    }// Main Function

}// DRIVER CLASS