/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bank;
import Model.Database;
import Model.Pemasukan;
import View.InputDataPemasukan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Syaehoni
 */
public class CInputDataPemasukan implements ActionListener{
    private InputDataPemasukan IDP = new InputDataPemasukan();
    private Database DB = new Database();
    private Pemasukan P;
    public static long iDPemasukan = 1451728391;
    private ArrayList<Bank> bank = new ArrayList<>(); 
    
    public CInputDataPemasukan(){
        IDP.setLocationRelativeTo(null);
        IDP.setVisible(true);
        IDP.setActionListener(this);
        bank=DB.getAllBank();
        for (int i = 0; i < bank.size(); i++) {
            IDP.setIDBankBox(bank.get(i).getKodeBank());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource().equals(IDP.getBatalButton())){
                CMainMenu MM = new CMainMenu();
                IDP.setVisible(false);
                IDP.dispose();
            }else if (e.getSource().equals(IDP.getSimpanButton())){
                P= new Pemasukan(String.valueOf(iDPemasukan+1)
                        , IDP.getTanggalField()
                        , IDP.getJenisField(), 
                        IDP.getJumlahField(), DB.getBank(IDP.getIDBankField()));
                DB.LaporanPemasukan(P);
                IDP.showMessage("Data Telah Tersimpan");
                CMainMenu MM = new CMainMenu();
                IDP.setVisible(false);
                IDP.dispose();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
