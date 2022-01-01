/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * /**
 *
 * @author jespe
 */
public class NewMain {

    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);

        }

        new LoginFrame(idb, 12).setVisible(true);

    }

}
