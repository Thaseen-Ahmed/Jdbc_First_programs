import java.sql.*;

//Creating a Table
public class _5_InsertJDBC_Creating_Table {
    public static void main(String[] args) {

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/thaseendb";
                    String username = "root";
                    String password = "Thaseen@08#";

                    Connection con = DriverManager.getConnection(url, username, password);

//          Creating the Query

                    String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null ,tCity varchar(400))";
                    Statement stmt = con.createStatement();
//
//          Passing the query via Update method
                    stmt.executeUpdate(q);
                    System.out.println("Table created in Database");

                    con.close();
                }

                catch (Exception e) {
//	            System.out.println(e);
                    e.printStackTrace();

                }
            }

    }

