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
            toLogin();
        }
        else if (e.getSource().equals(MMR.getBtnLDK())){
            toData();
        }
        else if (e.getSource().equals(MMR.getBtnProfile())){
            toProfile();
        }
    }
    public void toProfile(){
        MMR.setVisible(false);
        MMR.dispose();
        CProfile c= new CProfile();
    }
    public void toData(){
        MMR.setVisible(false);
        MMR.dispose();
        CData c= new CData();
    }
    public void toLogin(){
        MMR.setVisible(false);
        MMR.dispose();
        CLogin CL = new CLogin();
    }
}
