import java.sql.*;

public class MySQLConnectionXAMPP {
//    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
//        String hostName = "localhost";
//        String databaseName = "productmanegement";
//        String userName = "root";
//        String password = "";
//        return getMySQLConnection(hostName, databaseName, userName, password);
//    }
//
//    public static Connection getMySQLConnection(String hostName, String databaseName,
//                                                String userName, String password) throws SQLException, ClassNotFoundException {
//        //Load driver cho chuong trinh
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        String connectionString = "jdbc:mysql://" + hostName + ":3306/" + databaseName;
//        Connection connection = DriverManager.getConnection(connectionString, userName, password);
//        return connection;
//    }

    public static Connection getMySQLConnection()throws SQLException , ClassNotFoundException ,InstantiationException, IllegalAccessException {
        String hostName = "localhost";
        String databaseName = "productmanegement";
        String userName = "root";
        String password = "";
        return getMySQLConnection(hostName , databaseName , userName , password);
    }

    public static Connection getMySQLConnection(String hostName , String databaseName , String username , String password) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        String connectionString = "jdbc:mysql://"+hostName+":3306/"+databaseName;
        Connection connection = DriverManager.getConnection(connectionString,username,password);

        return connection;
    }

    public static void main(String[] args) throws SQLException , ClassNotFoundException , InstantiationException, IllegalAccessException{
        Connection connection = MySQLConnectionXAMPP.getMySQLConnection();

        Statement statement  = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from employee");

       resultSet.moveToCurrentRow();

        if (resultSet != null){
            System.out.printf("%-5s %-10s %s \n","ID" , "Emp No" ,"Emp Name");
            while (resultSet.next()){
            int eID = resultSet.getInt("empID");
            String empNo = resultSet.getString("empNo");
            String name = resultSet.getString("name");
                System.out.printf("%-5d %-10s %s \n",eID, empNo,name);
            }
        }
        else {
            System.out.println("That bai !");
        }


    }
}



