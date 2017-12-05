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
        public long IDPengeluaran = DB.getIdPengeluaran();
        private ArrayList<Civitas> civitas = new ArrayList<>();
    
    public CInputDataPengeluaran(){
        IDP.setLocationRelativeTo(null);
        IDP.setVisible(true);
        IDP.setActionListener(this);
        civitas=DB.getAllCivitas();
        for (int i = 0; i < civitas.size(); i++) {
            IDP.setIDKaryawanBox(civitas.get(i).getKodeCivitas());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource().equals(IDP.getBatalButton())){
                IDP.setVisible(false);
                IDP.dispose();
                CMainMenu MM = new CMainMenu();
            }else if (e.getSource().equals(IDP.getSimpanButton())&&IDP.getJumlahField()!=0&&IDP.getTanggalField()!=null){
                
                CMainMenu MM = new CMainMenu();
                IDP.setVisible(false);
                IDP.dispose();
            }
            else if (IDP.getTanggalField()==null||IDP.getJumlahField()==0){
                IDP.showMessage("Data Belum Terisi Dengan Lengkap");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void inputPengeluaran(){
        if (IDP.getJumlahField()!=0&&IDP.getTanggalField()!=null){
            IDPengeluaran++;
                P= new Pengeluaran(String.valueOf(IDPengeluaran)
                        , new java.sql.Date(IDP.getTanggalField().getTime())
                        , IDP.getJumlahField(),IDP.getJenisField(),DB.getCivitas(IDP.getIDCivitasField()));
                DB.LaporanPengeluaran(P);
                IDP.showMessage("Data Telah Tersimpan");
        }
    }
    
}
