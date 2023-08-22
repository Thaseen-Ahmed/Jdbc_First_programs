////package name;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class Connection_Provider_class {
//            private static Connection con;
//            public static Connection getConnection(){
//
//                try {
//
//                    if (con == null) {
//
//                        Class.forName("com.mysql.jdbc.Driver");
////                    con= DriverManager.getConnection(url,user,password)
//                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thaseendb", "root", "Thaseen@08#");
//
//                    }
//                }
//                catch (Exception e){
//
//                    e.printStackTrace();
//                }
//
//
//                return con;
//            }
//}
