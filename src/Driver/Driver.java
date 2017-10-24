/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;
import Controller.*;
import Model.Database;
/**
 *
 * @author banyu
 */
public class Driver {
    static Database d;
    public static void main(String[] args) {
        d.saveKaryawan();
        CLogin mulai= new CLogin();
    }
}
