package ket_noi_sql;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Minh
 */
//import static DataConnection.getConnection;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
/**
 *
 * @author mysqltutorial.org
 */
public class MySQLJDBCUtil {
 
    /**
     * Get database connection
     *
     * @return a Connection object
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
 
        try (FileInputStream f = new FileInputStream("info.properties")) {
 
            // load the properties file
            Properties pros = new Properties();
            pros.load(f);
 
            String url = pros.getProperty("url");
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
             
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) throws IOException, SQLException {
        Connection c = getConnection();
        if (c == null) {
            System.out.println("something wrong");
        } else {
            System.out.println("ok");
        }
}
}
