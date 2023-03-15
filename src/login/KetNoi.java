/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class KetNoi {

    public static Connection getJDBConnection() {
        Connection conn = null;
        String dbURL = "jdbc:sqlserver://DESKTOP-PV3OCED\\SQLEXPRESS:1433; databaseName=QLNH; Username=sa; Password=123;Encrypt=True;TrustServerCertificate=True";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(dbURL);

        } catch (Exception ex) {
            
        }
        return conn;
        
    }
}
