import java.sql.*;
import java.io.*;
public class _8_Inserting_Image_in_db_using_Java {
    public static void main(String[] args) {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/thaseendb";
                String user = "root";
                String password = "Thaseen@08#";
                Connection con = DriverManager.getConnection(url,user,password);
//                Another method to create connection
//       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thaseendb","root","Thaseen@08#");

//            Query to insert img in database
            String q = "insert into images(pic) values(?)";
//               (pic)-->refers coloumn name in table and id will auto incremented

            PreparedStatement prst = con.prepareStatement(q);
//            prst.setString(1,"values")
//            The above will not used to insert images because img files are in Bits(Binary)
//            So write the below to insert the images and have to create FileInputStream to store the file
//              To read the File

//            FileInputStream fis = new FileInputStream("tree.jpg");
            FileInputStream fis = new FileInputStream("C:\\Users\\Thaseen Ahmed\\Pictures\\tree.jpg");

            prst.setBinaryStream(1,fis,fis.available());
//              refer to       (position 1,FileInputStream,available space in fileinptstrm)
//
            prst.executeUpdate();

            System.out.println(" Done ! Images is Inserted in the table......");
//            con.close();

        }
        catch(Exception e){
            System.out.println("There is a Error!!!!! ");
            System.out.println(e);
            e.printStackTrace();
        }


    }
}

