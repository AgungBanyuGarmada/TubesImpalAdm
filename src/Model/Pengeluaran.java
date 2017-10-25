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
public class Pengeluaran {
    private String idKeuangan;
    private Date Tanggal;
    private double Nominal;
    private String Jenis;
    private Civitas Pengeluaran;

    public Pengeluaran(String idKeuangan, Date Tanggal, double Nominal, String Jenis, Civitas Pengeluaran) {
        this.idKeuangan = idKeuangan;
        this.Tanggal = Tanggal;
        this.Nominal = Nominal;
        this.Jenis = Jenis;
        this.Pengeluaran = Pengeluaran;
    }

    public double getNominal() {
        return Nominal;
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

    public Civitas getPengeluaran() {
        return Pengeluaran;
    }   

    public String getJenis() {
        return Jenis;
    }
    
}
