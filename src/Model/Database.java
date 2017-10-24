/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    private ResultSet rs=null;
    
     public void buatKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/KeuanganTelkom";
            String hostname = "root";
            String password = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection(url, hostname, password);
            } catch (ClassNotFoundException ex) {
                System.err.println("koneksi gagal" +ex.getMessage());
            }
        } catch (SQLException ex) {
            System.err.println("koneksi gagal" +ex.getMessage());
        }
    }
    
     public void saveKaryawan(){
         try {
            buatKoneksi();
            String query = "INSERT INTO Rektor(NIP, nama, Id_Pemasukan, Id_Pengeluaran) "
                    +"VALUES ('a'.'a','a','a',)";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
