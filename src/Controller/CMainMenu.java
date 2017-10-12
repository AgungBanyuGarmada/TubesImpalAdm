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
        MainMenu MM;
    
    public CMainMenu() {
        MM = new MainMenu();
        MM.setLocationRelativeTo(null);
        MM.setVisible(true);
        MM.setActionListerner(this);
    }

    public void toInputDataPemasukan(){
        CInputDataPemasukan c=new CInputDataPemasukan();
        MM.setVisible(false);
        MM.dispose();
    }
    
    public void toInputDataPengeluaran(){
        CInputDataPengeluaran c=new CInputDataPengeluaran();
        MM.setVisible(false);
        MM.dispose();
    }
    
    public void toLihatData(){
        CData c=new CData();
        MM.setVisible(false);
        MM.dispose();
    }
    
    public void toCetakLaporan(){
        CCetakLaporan c=new CCetakLaporan();
        MM.setVisible(false);
        MM.dispose();
    }
    public void toLogout(){
        CLogin c= new CLogin();
        MM.setVisible(false);
        MM.dispose();
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
