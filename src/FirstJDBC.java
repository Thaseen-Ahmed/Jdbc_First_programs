
import java.sql.*;
public class FirstJDBC {
    public static void main(String[] args) {


        // TODO Auto-generated method stub
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/thaseendb";
            String user = "root";
            String password = "Thaseen@08#";

            Connection con = DriverManager.getConnection(url,user,password);
            if(con.isClosed()) {
                System.out.println("The Connection is Closed");

            }
            else {
                System.out.println("The Connection is Created...");
            }
        }
        catch(Exception e){
//          System.out.println(e);
            e.printStackTrace();
        }

    }
}
