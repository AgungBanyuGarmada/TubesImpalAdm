/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.Pemasukan;
import Model.Pengeluaran;
import View.CetakLaporan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
/**
 *
 * @author Syaehoni
 */
public class CCetakLaporan implements ActionListener {
    
    private CetakLaporan CL= new CetakLaporan();
    private Database DB = new Database();
    ArrayList<Pemasukan> pemasukan = new ArrayList<>();
    ArrayList<Pengeluaran> pengeluaran = new ArrayList<>();

    public CCetakLaporan() {
        CL.setLocationRelativeTo(null);
        CL.setVisible(true);
        CL.setActionListener(this);
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(CL.getKembaliButton())){
            CL.setVisible(false);
            CL.dispose();
            CMainMenu mm = new CMainMenu();
        }
        else if (e.getSource().equals(CL.getCetakButton())){
            if(CL.getJenisBox().equals("Pemasukan")){
                pemasukan = DB.getListLaporanPemasukan(new java.sql.Date(CL.getTanggalField().getTime()));
                
                String c[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Bank"};
                String data[][] = new String[pemasukan.size()][c.length];
                int i = 0;
                for(Pemasukan P: pemasukan){
                    data[i][0] = P.getIdKeuangan().toString();
                    data[i][1] = P.getJenis();
                    data[i][2] = String.valueOf(P.getNominal()).toString();
                    data[i][3] = P.getTanggal().toString().toString();
                    data[i][4] = P.getPemasukan().getKodeBank().toString();
                    i++;
                }
                exportToExcel(c,data,i,4,"Pemasukan");
            }
            else if(CL.getJenisBox().equals("Pengeluaran")){
                pengeluaran = DB.getListLaporanPengeluaran(new java.sql.Date(CL.getTanggalField().getTime()));
                
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
                exportToExcel(c1,data1,i,4,"Pengeluaran");
            }
            try {
                Runtime.getRuntime().exec("cmd /c start D:\\Laporan.xls");
            } catch (IOException ex) {
                Logger.getLogger(CCetakLaporan.class.getName()).log(Level.SEVERE, null, ex);
            }
            CL.setVisible(false);
            CL.dispose();
            CMainMenu mm=new CMainMenu();

        }
        else if (e.getSource().equals(CL.getCetakSeluruhLaporanButton())){
            if(CL.getJenisBox().equals("Pemasukan")){
                pemasukan = DB.getListPemasukan();
                System.out.println("a");
                String c[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Bank"};
                String data[][] = new String[pemasukan.size()][c.length];
                int i = 0;
                for(Pemasukan P: pemasukan){
                    data[i][0] = P.getIdKeuangan().toString();
                    data[i][1] = P.getJenis();
                    data[i][2] = String.valueOf(P.getNominal()).toString();
                    data[i][3] = P.getTanggal().toString().toString();
                    data[i][4] = P.getPemasukan().getKodeBank().toString();
                    i++;
                }
                exportToExcel(c,data,i,4,"Pemasukan");
            }
            else if(CL.getJenisBox().equals("Pengeluaran")){
                pengeluaran = DB.getListPengeluaran();
                
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
                exportToExcel(c1,data1,i,4,"Pengeluaran");
            }
            try {
                Runtime.getRuntime().exec("cmd /c start D:\\Laporan.xls");
            } catch (IOException ex) {
                Logger.getLogger(CCetakLaporan.class.getName()).log(Level.SEVERE, null, ex);
            }
            CL.setVisible(false);
            CL.dispose();
            CMainMenu mm=new CMainMenu();
        }
        
}
    
    
    
    private void exportToExcel(String[] head,String[][] data,int index,int index2,String l) {
        WritableWorkbook myFirstWbook = null;
        try {

            myFirstWbook = Workbook.createWorkbook(new File("D:\\Laporan.xls"));

            // create an Excel sheet
            WritableSheet excelSheet = myFirstWbook.createSheet("Laporan "+l, 0);
            for (int i = 0; i < head.length; i++) {
                Label label = new Label(i, 0, head[i]);
                    excelSheet.addCell(label);
            }
            for (int i = 0; i < index; i++) {
                for (int j = 0; j <= index2; j++) {
                    Label label = new Label(j, i+1, data[i][j]);
                    excelSheet.addCell(label);
                }
            }

            myFirstWbook.write();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } finally {

            if (myFirstWbook != null) {
                try {
                    myFirstWbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }


        }

    }
}


