/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author banyu
 */
public class Database {
    
    private Statement stmt = null;
    private Connection c = null;
    
     public void buatKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/impal";
            String hostname = "root";
            String password = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection(url, hostname, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException exception) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
}
