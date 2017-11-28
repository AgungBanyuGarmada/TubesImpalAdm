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
    private String password;

    public Rektor(String nip, String nama, String password) {
        this.nip = nip;
        this.nama = nama;
        this.password = password;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }
}
