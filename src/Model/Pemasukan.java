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
public class Pemasukan {
    private String idKeuangan;
    private Date Tanggal;
    private String Jenis;
    private double Nominal;
    private Bank Pemasukan;

    public Pemasukan(String idKeuangan, Date Tanggal, String Jenis, double Nominal, Bank Pemasukan) {
        this.idKeuangan = idKeuangan;
        this.Tanggal = Tanggal;
        this.Jenis = Jenis;
        this.Nominal = Nominal;
        this.Pemasukan = Pemasukan;
    }

    public double getNominal() {
        return Nominal;
    }

    public void setPemasukan(Bank Pemasukan) {
        this.Pemasukan = Pemasukan;
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

    public String getJenis() {
        return Jenis;
    }
    
}
