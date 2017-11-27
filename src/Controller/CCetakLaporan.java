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
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
                pemasukan = DB.getListLaporanPemasukan(CL.getTanggalField());
                
                String c[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Bank"};
                String data[][] = new String[pemasukan.size()][c.length];
                int i = 0;
                for(Pemasukan P: pemasukan){
                    data[i][0] = P.getIdKeuangan();
                    data[i][1] = P.getJenis();
                    data[i][2] = String.valueOf(P.getNominal());
                    data[i][3] = P.getTanggal().toString();
                    data[i][3] = P.getPemasukan().getKodeBank();
                    i++;
                }
                JTable table = new JTable();
                table.setModel(new DefaultTableModel(data, c)); 
                exportToExcel(table, new File("DataTable.xls"));
            }
            else{
                pengeluaran = DB.getListLaporanPengeluaran(CL.getTanggalField());
                
                String c1[]= {"No Laporan","Jenis Laporan","Nominal","Tanggal","Kode Civitas"};
                String data1[][] = new String[pengeluaran.size()][c1.length];
                int i = 0;
                for(Pengeluaran P: pengeluaran){
                    data1[i][0] = P.getIdKeuangan();
                    data1[i][1] = P.getJenis();
                    data1[i][2] = String.valueOf(P.getNominal());
                    data1[i][3] = P.getTanggal().toString();
                    data1[i][3] = P.getPengeluaran().getKodeCivitas();
                    i++;
                }
                JTable table = new JTable();
                table.setModel(new DefaultTableModel(data1, c1)); 
                exportToExcel(table, new File("DataTable.xls"));
            }
            
        }
    }
    
    private void exportToExcel(JTable table, File file) {
        try{
            TableModel tableModel = table.getModel();
            FileWriter fOut = new FileWriter(file);
             
            for(int i = 0; i < tableModel.getColumnCount(); i++){
                fOut.write(tableModel.getColumnName(i)+"\t");
            }
             
            fOut.write("\n");
             
            for(int i = 0; i < tableModel.getRowCount(); i++){
                for(int j = 0; j < tableModel.getColumnCount(); j++){
                    fOut.write(tableModel.getValueAt(i, j).toString()+"\t");
                }
                fOut.write("\n");
            }
            fOut.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
