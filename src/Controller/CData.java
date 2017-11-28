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
    private Rektor r=D.getRektor();
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
            data[i][4] = P.getPemasukan().getKodeBank();
            i++;
        }
        
        GData.setPemasukanTable(data, c);
        
        String c1[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Civitas"};
        String data1[][] = new String[pengeluaran.size()][c1.length];
        i = 0;
        for(Pengeluaran P: pengeluaran){
            data1[i][0] = P.getIdKeuangan();
            data1[i][1] = P.getJenis();
            data1[i][2] = String.valueOf(P.getNominal());
            data1[i][3] = P.getTanggal().toString();
            data1[i][4] = P.getPengeluaran().getKodeCivitas();
            i++;
        }
        
        GData.setPengeluaranTable(data1, c1);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(GData.getPemasukanKembaliButton())||e.getSource().equals(GData.getPengeluaranKembaliButton())){
            GData.setVisible(false);
            GData.dispose();
            if (CLogin.SR==true){
                CMMR mm= new CMMR(r.getNama());
            }
            else{ 
                CMainMenu MM = new CMainMenu();
            }
        }
        else if (e.getSource().equals(GData.getOKPemasukanButton())&& (GData.getPemasukanCariBox().equals("None"))==false){
            pemasukan=D.getListPemasukans(GData.getPemasukanCariBox());       

            String c[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Bank"};
            String data[][] = new String[pemasukan.size()][c.length];
            int i = 0;
            for(Pemasukan P: pemasukan){
                data[i][0] = P.getIdKeuangan();
                data[i][1] = P.getJenis();
                data[i][2] = String.valueOf(P.getNominal());
                data[i][3] = P.getTanggal().toString();
                data[i][4] = P.getPemasukan().getKodeBank();
                i++;
            }

            GData.setPemasukanTable(data, c);
        }
        else if (e.getSource().equals(GData.getOKPengeluaranButton()) && (GData.getPengeluaranCariBox().equals("None"))==false){
            pengeluaran=D.getListPengeluarans(GData.getPengeluaranCariBox()); 
            String c1[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Civitas"};
            String data1[][] = new String[pengeluaran.size()][c1.length];
            int i = 0;
            for(Pengeluaran P: pengeluaran){
                data1[i][0] = P.getIdKeuangan();
                data1[i][1] = P.getJenis();
                data1[i][2] = String.valueOf(P.getNominal());
                data1[i][3] = P.getTanggal().toString();
                data1[i][4] = P.getPengeluaran().getKodeCivitas();
                i++;
            }

            GData.setPengeluaranTable(data1, c1);
        }
        else if (e.getSource().equals(GData.getOKPemasukanButton())&&(GData.getPemasukanCariBox().equals("None"))){
            pemasukan=D.getListPemasukan();
            String c[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Bank"};
            String data[][] = new String[pemasukan.size()][c.length];
            int i = 0;
            for(Pemasukan P: pemasukan){
                data[i][0] = P.getIdKeuangan();
                data[i][1] = P.getJenis();
                data[i][2] = String.valueOf(P.getNominal());
                data[i][3] = P.getTanggal().toString();
                data[i][4] = P.getPemasukan().getKodeBank();
                i++;
            }

            GData.setPemasukanTable(data, c);
        }
        else if (e.getSource().equals(GData.getOKPengeluaranButton())&&(GData.getPengeluaranCariBox().equals("None"))){
            pengeluaran=D.getListPengeluaran(); 
            String c1[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Civitas"};
            String data1[][] = new String[pengeluaran.size()][c1.length];
            int i = 0;
            for(Pengeluaran P: pengeluaran){
                data1[i][0] = P.getIdKeuangan();
                data1[i][1] = P.getJenis();
                data1[i][2] = String.valueOf(P.getNominal());
                data1[i][3] = P.getTanggal().toString();
                data1[i][4] = P.getPengeluaran().getKodeCivitas();
                i++;
            }

            GData.setPengeluaranTable(data1, c1);
        }
    }
}