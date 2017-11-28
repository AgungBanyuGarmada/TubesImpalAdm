/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.Profile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author banyu
 */
public class CProfile implements ActionListener{
    private Profile p = new Profile();
    Database DB = new Database();

    public CProfile() {
        p.LbStatus();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setActionListenr(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(p.getBtnUbah())){
            if((p.getFPL().equals(DB.getRektor().getPassword()))&&(p.getFPB1().equals(p.getFPB2()))){
                DB.UpdateRektorPassword(DB.getRektor().getNip(),p.getFPB1());
                p.showMessage("Password Berhasil Dirubah");
                p.setVisible(false);
                p.dispose();
                CMMR mm=new CMMR(DB.getRektor().getNama());
            }
            else{
                p.showMessage("Password yang diinputkan salah");
            }
        }
        else if(e.getSource().equals(p.getBtnBatal())){
            p.setVisible(false);
            p.dispose();
            CMMR mm=new CMMR(DB.getRektor().getNama());
        }
    }
       
}
