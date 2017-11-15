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
import java.util.ArrayList;
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
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/KeuanganTelkom", "root", "");
                stmt=c.createStatement();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void LaporanPemasukan(Pemasukan p){
         try {
            buatKoneksi();
            String query = "INSERT Pemasukan (Id_Pemasukan, Tanggal, Jenis, Saldo, Kode_Bank) "
                    +"VALUES ('"+p.getIdKeuangan()+"','"+p.getTanggal()
                    +"',"+p.getJenis()+",'"+p.getNominal()+"','"+p.getPemasukan().getKodeBank()+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void LaporanPengeluaran(Pengeluaran p){
         try {
            buatKoneksi();
            String query = "INSERT Pemasukan (Id_Pengeluaran, Tanggal, Jenis, Saldo, Kode_Civitas) "
                    +"VALUES ('"+p.getIdKeuangan()+"','"+p.getTanggal()
                    +"',"+p.getJenis()+",'"+p.getNominal()+"','"+p.getPengeluaran().getKodeCivitas()+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Pemasukan> getListPemasukan()  {
        try {
            ArrayList<Pemasukan> listPemasukan  = new ArrayList<>();
            buatKoneksi();
            String q = "select idPemasukan, Tanggal, Jenis, Saldo, Kode_Bank from Pemasukan";
            stmt = c.createStatement();
            rs = stmt.executeQuery(q);
            while(rs.next()){
                Pemasukan p = new Pemasukan(rs.getString("idPemasukan"),rs.getDate("Tanggal"),rs.getString("Jenis"),rs.getDouble("Saldo"),getBank(rs.getString("Kode_Bank")));
                listPemasukan.add(p);
            }
            c.close();
            return listPemasukan;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Pengeluaran> getListPengeluaran()  {
        try {
            ArrayList<Pengeluaran> listPengeluaran  = new ArrayList<>();
            buatKoneksi();
            String q = "select idPengeluaran, Tanggal, Jenis, Saldo, Kode_Civitas from Pengeluaran";
            stmt = c.createStatement();
            rs = stmt.executeQuery(q);
            while(rs.next()){
                Pengeluaran p = new Pengeluaran(rs.getString("idPengeluaran"),rs.getDate("Tanggal"),rs.getDouble("Saldo"),rs.getString("Jenis"),getCivitas(rs.getString("Kode_civitas")));
                listPengeluaran.add(p);
            }
            c.close();
            return listPengeluaran;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public Bank getBank(String idBank)  {
        try {
            Bank b=null;
            buatKoneksi();
            String q = "select Kode_Bank, Nama_Bank from Bank where Kode_Bank = '"+idBank+"'";
            stmt = c.createStatement();
            rs = stmt.executeQuery(q);
            while(rs.next()){
                b = new Bank(rs.getString("Kode_Bank"),rs.getString("Nama_Bank"));
            }
            c.close();
            return b;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public Civitas getCivitas(String IDC)  {
        try {
            Civitas b=null;
            buatKoneksi();
            String q = "select Kode_Civitas, Nama, Nominal from Civitas where Kode_Civitas = '"+IDC+"'";
            stmt = c.createStatement();
            rs = stmt.executeQuery(q);
            while(rs.next()){
                b = new Civitas(rs.getString("Kode_Civitas"),rs.getString("nama"),rs.getString("Jabatan"),rs.getDouble("Nominal"));
            }
            c.close();
            return b;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
