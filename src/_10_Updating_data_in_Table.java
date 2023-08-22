import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class _10_Updating_data_in_Table {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
//              Connection  con= DriverManager.getConnection(url,user,password)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thaseendb", "root", "Thaseen@08#");
            String q ="update table1 set tName=?, tCity=? where tId=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the New Name: ");
            String name=br.readLine();

            System.out.println("Enter the New City Name: ");
            String city =br.readLine();

            System.out.println("Enter the Student Id:");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);

            pstmt.executeUpdate();

            System.out.println("The new Datas are Updated in Db....");
            con.close();


        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Error in updating the Db..");
        }
    }
}
