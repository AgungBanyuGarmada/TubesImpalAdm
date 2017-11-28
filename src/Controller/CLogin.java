/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.Rektor;
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
    private String id="adm05";
    private String pw="adm05";
    private Database DB = new Database();
    private Rektor r = DB.getRektor();
    public static boolean SR =false;
    
    public CLogin() {
        login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setActionListener(this); //add action listener utk semua button
//        Database d=new Database();
//        d.saveKaryawan();
    }
    
    public void LoginButtonPerformed(ActionEvent e){
        if(login.getUsernameField().equals(id) && login.getPasswordField().equals(pw))
        {
            login.setVisible(false);
            login.dispose();
            CMainMenu MM = new CMainMenu();
            SR=false;
        }
        else if (login.getUsernameField().equals(r.getNip()) && login.getPasswordField().equals(r.getPassword())){
            SR=true;
            login.setVisible(false);
            login.dispose();
            CMMR mm= new CMMR(r.getNama());
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
