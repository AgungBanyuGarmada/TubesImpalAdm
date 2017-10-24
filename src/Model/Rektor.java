package Model;


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
public class Rektor {
    private String nip;
    private String nama;
    private List<Pemasukan> pemasukan;
    private List<Pengeluaran> pengeluaran;

    public Rektor(String nip, String nama, List<Pemasukan> pemasukan, List<Pengeluaran> pengeluaran) {
        this.nip = nip;
        this.nama = nama;
        this.pemasukan = pemasukan;
        this.pengeluaran = pengeluaran;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public List<Pemasukan> getPemasukan() {
        return pemasukan;
    }

    public List<Pengeluaran> getPengeluaran() {
        return pengeluaran;
    }

}
