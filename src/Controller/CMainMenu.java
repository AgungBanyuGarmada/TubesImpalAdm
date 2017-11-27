/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author banyu
 */
public class CMainMenu implements ActionListener{
        private MainMenu MM;
    
    public CMainMenu() {
        MM = new MainMenu();
        MM.setLocationRelativeTo(null);
        MM.setVisible(true);
        MM.setActionListerner(this);
    }

    public void toInputDataPemasukan(){
        MM.setVisible(false);
        MM.dispose();
        CInputDataPemasukan c=new CInputDataPemasukan();
    }
    
    public void toInputDataPengeluaran(){
        MM.setVisible(false);
        MM.dispose();
        CInputDataPengeluaran c=new CInputDataPengeluaran();
    }
    
    public void toLihatData(){
        MM.setVisible(false);
        MM.dispose();
        CData c=new CData();
    }
    
    public void toCetakLaporan(){
        MM.setVisible(false);
        MM.dispose();
        CCetakLaporan c=new CCetakLaporan();
    }
    public void toLogout(){
        MM.setVisible(false);
        MM.dispose();
        CLogin c= new CLogin();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
                if(e.getSource().equals(MM.getInputDataPemasukanButton()))
                    toInputDataPemasukan();
                else if(e.getSource().equals(MM.getInputDataPengeluaranButton()))
                    toInputDataPengeluaran();
                else if (e.getSource().equals(MM.getLihatDataButton()))
                    toLihatData();
                else if (e.getSource().equals(MM.getCetakLaporanButton()))
                    toCetakLaporan();
                else
                    toLogout();
            } 
        catch (Exception ex) {
                Logger.getLogger(CLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
