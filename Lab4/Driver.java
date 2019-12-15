
import javax.swing.JOptionPane;

public class Driver {
    public static void main(String[] args) {
        Dictionary obj = new Dictionary();
        String input;
        int option = 0;
        while (option != 4) {
            input = JOptionPane.showInputDialog(
                    "Enter 1 for New Record\nEnter 2 for Search Record\nEnter 3 for Update Record\nEnter 4 to EXIT");
            try {
                option = Integer.parseInt(input);
            }

            catch (NumberFormatException e) {
                option = 0;
                System.out.println("Only Numbers are allowed\nNote:-Donot use Aplhabets or Special Characters");
            } // catch block end

            String n, m;
            switch (option) {
            case 1:
                n = JOptionPane.showInputDialog("Enter Word for Add Record ");
                m = JOptionPane.showInputDialog("Enter word Meaning for Add Record");
                obj.addNewRecord(n, m);
                break; // case 1 end

            case 2:

                n = JOptionPane.showInputDialog("Enter Word for Search");
                try {
                    int i = obj.searchRecord(n);
                    if (i == -1)
                        throw new noContentAvailableException();
                    else {
                        System.out.println(obj.name.get(i));
                        System.out.println(obj.meaning.get(i));

                    }
                } catch (noContentAvailableException ncaex) {
                    ncaex.toString();

                }
                break; // case 2 end

            case 3:

                n = JOptionPane.showInputDialog("Enter Word for Update Record ");
                m = JOptionPane.showInputDialog("Enter word Meaning for Update Record");
                obj.updateRecord(n, m);
                break; // case 3 end

            } // swtich case end
        } // while loop
        obj.saveSample();
    } // main function

} // class end