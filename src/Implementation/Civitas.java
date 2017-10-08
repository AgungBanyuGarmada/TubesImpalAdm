package Implementation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syaehoni
 */
public class Civitas {
    private String KodeCivitas;
    private String Nama;
    private String Jabatan;
    private double Nominal;

    public Civitas(String KodeCivitas, String Nama, String Jabatan, double Nominal) {
        this.KodeCivitas = KodeCivitas;
        this.Nama = Nama;
        this.Jabatan = Jabatan;
        this.Nominal = Nominal;
    }

    public String getKodeCivitas() {
        return KodeCivitas;
    }

    public void setKodeCivitas(String KodeCivitas) {
        this.KodeCivitas = KodeCivitas;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public double getNominal() {
        return Nominal;
    }

    public void setNominal(double Nominal) {
        this.Nominal = Nominal;
    }
    
    
}
