//      Inserting values in table using PreparedStatement

import java.sql.*;

public class _6_Insert_data_us_PreparedStatement {
    public static void main(String[] args) {

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/thaseendb";
        String user = "root";
        String password = "Thaseen@08#";

        Connection con = DriverManager.getConnection(url,user,password);

//        Creating a Query ---  we don't have to mention tId in this because we auto incremented it
        String q="insert into table1(tName,tCity) value(?,?)";

//        Get the PrepareStatement Object
//        Interface(object)          Method to run
       PreparedStatement prst = con.prepareStatement(q);

//       Setting the Values
//    the both tName and City are String,so we have to use setString to set values

//        prst.setString(1,"Thaseen Ahmed");
//        prst.setString(2,"Ambur");
        prst.setString(1,"Mohammed Adnan");
        prst.setString(2,"Chennai");

//     In the below method we don't have to pass q in the exeUpdate() during using PreparedStatement()
//     if we pass the value will be reset because we already
//     passed  in last program means in creating table
        prst.executeUpdate();
//         prst.executeUpdate(q);   ---> dont do this
        System.out.println("Inserted the values in table..."+prst  );
//        Closing the Connection
        con.close();

    }
    catch (Exception e){
        e.printStackTrace();
    }

    }
}
