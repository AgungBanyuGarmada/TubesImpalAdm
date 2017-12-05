/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import View.*;

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
    @Test
    public void testActionPerformed() throws InterruptedException {
        System.out.println("actionPerformed");
        Data d=new Data();
        boolean status = false;
//        ActionEvent e = null;
        CData instance = new CData();
//        e.equals(d.getPemasukanKembaliButton());
        boolean exR =false;
        boolean result = instance.actionPerformed(status);
        assertEquals(exR , result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
