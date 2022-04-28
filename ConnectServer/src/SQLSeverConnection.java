
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.*;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.SQLException;


public class SQLSeverConnection {
    public static Connection getSQLServerConnection() throws SQLException, ClassNotFoundException, NoSuchAlgorithmException, IOException, KeyManagementException {
        String hostName = "localhost";
        String severName = "LAPTOP-BGF9U42U"; // dùng server name sql
        String database ="bookstore"; // dùng tên của table
        String login = "lamduc"; // tài khoản kết nối
        String password ="123456"; //mk của tài khoản
        Connection connection = getSQLServerConnection(hostName,severName,database,login,password); // gọi hàm connect





        return connection;
    }

    public static Connection getSQLServerConnection(String hostname , String severName , String database , String userName , String password) throws SQLException, ClassNotFoundException, NoSuchAlgorithmException, KeyManagementException, IOException {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://"+hostname+":1433;instance="+severName+";databaseName="+database;
//               String dbURL = "jdbc:sqlserver://10.0.0.109;databaseName=bookstore;user=lamduc;password=123456";

//        String dbURL = "jdbc:sqlserver://10.0.0.109;databaseName=bookstore;user=lamduc;password=123456";
      // Connection conn = DriverManager.getConnection(dbURL);

        //Connection connection = DriverManager.getConnection("jdbc:sqlserver://10.0.0.109/bookstore","lamduc","123456");
       Connection connection = DriverManager.getConnection(connectionString,userName,password);



       return connection;

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchAlgorithmException, IOException, KeyManagementException {
        Connection connection=getSQLServerConnection();


        if (connection !=null){
            System.out.println("kết nối thành công ");
        }else {
            System.out.println("kết nối không thành công");//"encrypt=true;trustServerCertificate=true";

        }

    }

}
