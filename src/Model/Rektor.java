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
    private List<Keuangan> Laporan;

    public Rektor(String nip, String nama, Keuangan Laporan) {
        this.nip = nip;
        this.nama = nama;
        this.Laporan.add(Laporan);
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public List<Keuangan> getLaporan() {
        return Laporan;
    }
    
    public void addLaporan (Keuangan k){
        Laporan.add(k);
    }
}
