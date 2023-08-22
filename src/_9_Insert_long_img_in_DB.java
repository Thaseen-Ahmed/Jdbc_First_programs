import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class _9_Insert_long_img_in_DB {
    public static void main(String[] args) {

        try{

//            Connection c = Connection_Provider_class.getConnection();

            Class.forName("com.mysql.cj.jdbc.Driver");
//              Connection  con= DriverManager.getConnection(url,user,password)
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thaseendb", "root", "Thaseen@08#");

           String q = "insert into images(pic) value(?)";
            PreparedStatement prst = con.prepareStatement(q);

//            To choose a file or img by yourself the below statement is used

            JFileChooser jfc= new JFileChooser();
//            To open the Dialog box
            jfc.showOpenDialog(null);

            File file =jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            prst.setBinaryStream(1,fis,fis.available());

            prst.executeUpdate();

//            System.out.println("  DONE!The Large img is Inserted in DB....");
            JOptionPane.showMessageDialog(null,"Success");
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Error Not inserted");
        }
    }
}
