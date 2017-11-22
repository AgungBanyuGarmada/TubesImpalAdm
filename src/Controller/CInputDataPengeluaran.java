/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Civitas;
import Model.Database;
import Model.Pemasukan;
import Model.Pengeluaran;
import View.InputDataPengeluaran;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Syaehoni
 */
public class CInputDataPengeluaran implements ActionListener {

        private InputDataPengeluaran IDP = new InputDataPengeluaran();
        private Database DB = new Database();
        private Pengeluaran P;
        public static long iDPemasukan = 1451728391;
        private ArrayList<Civitas> civitas = new ArrayList<>();
    
    public CInputDataPengeluaran(){
        IDP.setLocationRelativeTo(null);
        IDP.setVisible(true);
        IDP.setActionListener(this);
        for (int i = 0; i < civitas.size(); i++) {
            IDP.setIDKaryawanBox(civitas.get(i).getKodeCivitas());
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
                P= new Pengeluaran(String.valueOf(iDPemasukan+1)
                        , IDP.getTanggalField()
                        , DB.getCivitas(IDP.getIDCivitasField()).getNominal()
                        , IDP.getJenisField()
                        , DB.getCivitas(IDP.getIDCivitasField()));
                DB.LaporanPengeluaran(P);
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
