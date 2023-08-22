import java.sql.*;
import java.io.*;

public class _7_Inserting_data_in_Table_Dynamic_Input {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/thaseendb";
            String user = "root";
            String password = "Thaseen@08#";

            Connection con = DriverManager.getConnection(url, user, password);

//        Creating a Query ---  we don't have to mention tId in this because we auto incremented it
            String q = "insert into table1(tName,tCity) value(?,?)";

//        Get the PrepareStatement Object
//        Interface(object)          Method to run
            PreparedStatement prst = con.prepareStatement(q);
            //       Setting the Values
//    the both tName and City are String,so we have to use setString to set values

//            The Below statement is used to get the value from user and to store in Database
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     The above is  BufferedReader is a Java class that reads text from the input stream.
//     It buffers the characters so that it can get the efficient reading of characters, arrays, etc.

            System.out.println("Enter the Name:");
                String name= br.readLine();
            System.out.println("Enter the City");
            String city= br.readLine();

//        prst.setString(1,"Thaseen Ahmed"); ---> will be stored in tName
//        prst.setString(2,"Ambur");      ----> will be stored in tCity
            prst.setString(1,name);
            prst.setString(2,city);

//     In the below method we don't have to pass q in the exeUpdate() during using PreparedStatement()
//
            prst.executeUpdate();
//         prst.executeUpdate(q);   ---> dont do this
            System.out.println("HURRRRAYYYYYYY");
            System.out.println("The values given by u are Inserted in table...");
//        Closing the Connection
            con.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

