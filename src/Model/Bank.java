package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syaehoni
 */
public class Bank {
    private String KodeBank;
    private String NamaBank;

    public Bank(String KodeBank, String NamaBank) {
        this.KodeBank = KodeBank;
        this.NamaBank = NamaBank;
    }

    public String getKodeBank() {
        return KodeBank;
    }

    public String getNamaBank() {
        return NamaBank;
    }
    
}
