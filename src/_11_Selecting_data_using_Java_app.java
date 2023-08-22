import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _11_Selecting_data_using_Java_app {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
//              Connection  con= DriverManager.getConnection(url,user,password)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thaseendb", "root", "Thaseen@08#");
            String query = "select * from table1";
//       We have create the query by using the below Statement
            Statement st = con.createStatement();

//       We have store a result set to the query by using the below Statement
            ResultSet set = st.executeQuery(query);

//       To automatically find and go to avialble rows we use while loop this will go automatically if another row is available
            while(set.next()) {

//        The Below Specifies the colunmn of the Database Table
                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);

                System.out.println("The Name of Student is " + name + " And the Id is " + id + " and the City is :" + city);
                System.out.println(name + ":" + id + ":" + city);


            }

            con.close();

        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
