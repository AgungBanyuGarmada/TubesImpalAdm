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
    private double Saldo;

    public Bank(String KodeBank, String NamaBank, double Saldo) {
        this.KodeBank = KodeBank;
        this.NamaBank = NamaBank;
        this.Saldo = Saldo;
    }

    public String getKodeBank() {
        return KodeBank;
    }

    public String getNamaBank() {
        return NamaBank;
    }

    public double getSaldo() {
        return Saldo;
    }
    
}
