/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class LoginIT {
    
    public LoginIT() {
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
     * Test of setActionListener method, of class Login.
     */
    @Test
    public void testSetActionListener() {
        System.out.println("setActionListener");
        ActionListener a = null;
        Login instance = new Login();
        instance.setActionListener(a);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showMessage method, of class Login.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        String m = "";
        Login instance = new Login();
        instance.showMessage(m);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of getPasswordField method, of class Login.
     */
    @Test
    public void testGetPasswordField() {
        System.out.println("getPasswordField");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getPasswordField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getUsernameField method, of class Login.
     */
    @Test
    public void testGetUsernameField() {
        System.out.println("getUsernameField");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getUsernameField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPasswordField method, of class Login.
     */
    @Test
    public void testSetPasswordField() {
        System.out.println("setPasswordField");
        Login instance = new Login();
        instance.setPasswordField();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUsernameField method, of class Login.
     */
    @Test
    public void testSetUsernameField() {
        System.out.println("setUsernameField");
        Login instance = new Login();
        instance.setUsernameField();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
