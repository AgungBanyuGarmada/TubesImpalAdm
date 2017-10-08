
import java.util.Date;
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
    private List<Bank> Pemasukan;
    private List<Civitas> Pengeluaran;

    public Keuangan(String idKeuangan, Date Tanggal, Bank Pemasukan, Civitas Pengeluaran) {
        this.idKeuangan = idKeuangan;
        this.Tanggal = Tanggal;
        this.Pemasukan.add(Pemasukan);
        this.Pengeluaran.add(Pengeluaran);
    }

    public String getIdKeuangan() {
        return idKeuangan;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public List<Bank> getPemasukan() {
        return Pemasukan;
    }

    public List<Civitas> getPengeluaran() {
        return Pengeluaran;
    }
    
    public void addPemasukan (Bank b){
        Pemasukan.add(b);
    }
    
    public void addPengeluaran(Civitas c){
        Pengeluaran.add(c);
    }
}
