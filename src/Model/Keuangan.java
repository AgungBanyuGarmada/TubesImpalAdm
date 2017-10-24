package Model;


import java.sql.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syaehoni
 */
public class Keuangan {
    private String idKeuangan;
    private Date Tanggal;
    private String Jenis;
    private Bank Pemasukan;
    private Civitas Pengeluaran;

    public Keuangan(String idKeuangan, Date Tanggal, String Jenis) {
        this.idKeuangan = idKeuangan;
        this.Tanggal = Tanggal;
        this.Jenis = Jenis;
    }

    public void setPemasukan(Bank Pemasukan) {
        this.Pemasukan = Pemasukan;
    }

    public void setPengeluaran(Civitas Pengeluaran) {
        this.Pengeluaran = Pengeluaran;
    }

    public String getIdKeuangan() {
        return idKeuangan;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public Bank getPemasukan() {
        return Pemasukan;
    }

    public Civitas getPengeluaran() {
        return Pengeluaran;
    }   

    public String getJenis() {
        return Jenis;
    }
    
}
