/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.MainMenuRektor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author banyu
 */
public class CMMR implements ActionListener{
    MainMenuRektor MMR = new MainMenuRektor();
    Database DB = new Database();
    
    public CMMR(String nama){
        MMR.setLocationRelativeTo(null);
        MMR.setVisible(true);
        MMR.setActionListener(this);
        MMR.setNamaRektor(nama);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(MMR.getBtnLogout())){
            MMR.setVisible(false);
            MMR.dispose();
            CLogin CL = new CLogin();
        }
        else if (e.getSource().equals(MMR.getBtnLDK())){
            MMR.setVisible(false);
            MMR.dispose();
            CData c= new CData();
        }
        else if (e.getSource().equals(MMR.getBtnProfile())){
            MMR.setVisible(false);
            MMR.dispose();
            CProfile c= new CProfile();
        }
    }
}
