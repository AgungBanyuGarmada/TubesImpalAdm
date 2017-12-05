/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.Pengeluaran;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author banyu
 */
public class CCetakLaporanIT {
    
    public CCetakLaporanIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class CCetakLaporan.
     */
//    @Test
//    public void testActionPerformed() {
//        System.out.println("actionPerformed");
//        ActionEvent e = null;
//        CCetakLaporan instance = new CCetakLaporan();
//        instance.actionPerformed(e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of exportToExcel method, of class CCetakLaporan.
     */
    @Test
    public void testExportToExcel() {
        System.out.println("exportToExcel");
        ArrayList<Pengeluaran> pengeluaran=new ArrayList<>();
        Database DB= new Database();
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
        CCetakLaporan instance = new CCetakLaporan();
        instance.exportToExcel(c1,data1,i,1,"Pengeluaran");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
