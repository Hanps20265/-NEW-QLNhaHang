package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerConnect {
    public static Connection connToSQL(String user, String pass, int port, String databaseName) {
        String db_url ="jdbc:sqlserver://localhost:1433;databaseName=QLNHAHANG_NHOM3"; 
        System.out.println(db_url);
        Connection conn = null; 
        try {
            conn = DriverManager.getConnection(db_url,user,pass);
        } catch (SQLException ex) { 
            return null;
        }
        return conn;
    }
}
