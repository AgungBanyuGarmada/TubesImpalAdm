/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Syaehoni
 */
public class CData implements ActionListener {
    private Data GData = new Data();
    private Database D = new Database();
    private ArrayList<Pemasukan> pemasukan= new ArrayList<>();
    private ArrayList<Pengeluaran> pengeluaran= new ArrayList<>();

    public CData() {
        GData.setLocationRelativeTo(null);
        GData.setVisible(true);
        GData.setActionListener(this);
        
        pemasukan=D.getListPemasukan();
        pengeluaran=D.getListPengeluaran();
        
        String c[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Bank"};
        String data[][] = new String[pemasukan.size()][c.length];
        int i = 0;
        for(Pemasukan P: pemasukan){
            data[i][0] = P.getIdKeuangan();
            data[i][1] = P.getJenis();
            data[i][2] = String.valueOf(P.getNominal());
            data[i][3] = P.getTanggal().toString();
            data[i][3] = P.getPemasukan().getNamaBank();
            i++;
        }
        
        GData.setPemasukanTable(data, c);
        
        String c1[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Civitas"};
        String data1[][] = new String[pemasukan.size()][c1.length];
        i = 0;
        for(Pengeluaran P: pengeluaran){
            data1[i][0] = P.getIdKeuangan();
            data1[i][1] = P.getJenis();
            data1[i][2] = String.valueOf(P.getNominal());
            data1[i][3] = P.getTanggal().toString();
            data1[i][3] = P.getPengeluaran().getKodeCivitas();
            i++;
        }
        
        GData.setPengeluaranTable(data1, c1);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource().equals(GData.getPemasukanKembaliButton())||e.getSource().equals(GData.getPengeluaranKembaliButton())){
                CMainMenu MM = new CMainMenu();
                GData.setVisible(false);
                GData.dispose();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
