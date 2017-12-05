/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pemasukan;
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
public class CDataIT {
    
    public CDataIT() {
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
     * Test of actionPerformed method, of class CData.
     */
//    @Test
//    public void testActionPerformed() {
//        System.out.println("actionPerformed");
//        ActionEvent e = null;
//        CData instance = new CData();
//        instance.actionPerformed(e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setPemasukanTable method, of class CData.
     */
    @Test
    public void testSetPemasukanTable() {
        System.out.println("setPemasukanTable");
        ArrayList<Pemasukan> pemasukan = new ArrayList<>();
        CData instance = new CData();
        instance.setPemasukanTable(pemasukan);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPengeluaranTable method, of class CData.
     */
    @Test
    public void testSetPengeluaranTable() {
        System.out.println("setPengeluaranTable");
        ArrayList<Pengeluaran> pengeluaran = new ArrayList<>();
        CData instance = new CData();
        instance.setPengeluaranTable(pengeluaran);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
