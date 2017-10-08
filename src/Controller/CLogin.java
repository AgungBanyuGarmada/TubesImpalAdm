/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Keuangan;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author banyu
 */
public class CLogin implements ActionListener{
    private Login login;
    
    public CLogin() {
        login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setActionListener(this); //add action listener utk semua button
    }
    
    public void LoginButtonPerformed(ActionEvent e){
        if(login.getUsernameField().equals(Keuangan.id) && login.getPasswordField().equals(Keuangan.pw))
        {
            CMainMenu MM = new CMainMenu();
            login.setVisible(false);
            login.dispose();
        }
        else
            login.showMessage("Username atau Password anda Salah ");
            login.setUsernameField();
            login.setPasswordField();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            try {
                if(e.getSource().equals(login.getLoginButton()))
                    LoginButtonPerformed(e);
            } 
            catch (Exception ex) {
                Logger.getLogger(CLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }    
    
}
