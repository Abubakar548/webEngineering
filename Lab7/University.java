import java.sql.*;
import java.util.*;

class University {

    void showAll() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/lab7";
            Connection con = DriverManager.getConnection(url, "root", "admin");
            String query = "select * from student ";
            PreparedStatement pst = con.prepareStatement(query);

            ResultSet rs = pst.executeQuery(query);
            ResultSetMetaData rmd = rs.getMetaData();
            String colomn;

            if (rmd != null) {
                for (int i = 1; i <= rmd.getColumnCount(); i++) {
                    colomn = rmd.getColumnName(i);
                    System.out.print(colomn + "\t\t");

                }
                System.out.println("");
            }

            while (rs.next()) {
                String name = rs.getString(1);
                String roll_number = rs.getString(2);
                String degree = rs.getString(3);
                String mobile_number = rs.getString(4);
                String date_of_birth = rs.getString(5);
                System.out.println(
                        name + "\t" + roll_number + "\t" + degree + "\t" + mobile_number + "\t" + date_of_birth);

            }

            con.close();

        } // try
        catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);

        }

    } // showData

    void insertData() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/lab7";
            Connection con = DriverManager.getConnection(url, "root", "admin");

            String query = "insert into student(name,roll_number,degree,mobile_number,date_of_birth) values(?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(query);

            Scanner inp = new Scanner(System.in);

            System.out.print("Please enter Name: ");
            String name = inp.nextLine();

            System.out.print("Please enter RollNumber: ");
            String roll_number = inp.nextLine();

            System.out.print("Please enter Degree: ");
            String degree = inp.nextLine();

            System.out.print("Please enter Mobile Number: ");
            String mobile_number = inp.nextLine();

            System.out.print("Please enter Date of Birth: ");
            String date_of_birth = inp.nextLine();

            pst.setString(1, name);
            pst.setString(2, roll_number);
            pst.setString(3, degree);
            pst.setString(4, mobile_number);
            pst.setString(5, date_of_birth);

            int rs = pst.executeUpdate();

            if (rs > 0) {
                System.out.println("Record inserted successfully.");
            }

            else {
                System.out.println("Record could not inserted.");
            }

            inp.close();
            con.close();

        } // try
        catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);

        }

    } // insert Data

    void deleteData(String rollNumber) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/lab7";
            Connection con = DriverManager.getConnection(url, "root", "admin");

            String query = "delete from student where roll_number = ?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, rollNumber);
            int rs = pst.executeUpdate();

            if (rs > 0) {
                System.out.println("Record Deleted successfully.");
            }

            else {
                System.out.println("Record could not Deleted.");
            }

            con.close();

        } // try
        catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);

        }

    } // delete data

}