package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class con {
    Connection connection;

    Statement statement;

    public con(){



        try{
            String url = "jdbc:mysql://localhost:3306/bankSystem?user=root&password=Mujawar@786";
            connection = DriverManager.getConnection(url);

             statement =connection.createStatement();












        }catch (Exception e){
            e.printStackTrace();




        }

    }

}
