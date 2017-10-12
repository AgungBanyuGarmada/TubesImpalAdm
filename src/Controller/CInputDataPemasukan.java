/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.InputDataPemasukan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Syaehoni
 */
public class CInputDataPemasukan implements ActionListener{
    InputDataPemasukan IDP = new InputDataPemasukan();
    
    public CInputDataPemasukan(){
        IDP.setLocationRelativeTo(null);
        IDP.setVisible(true);
        IDP.setActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
