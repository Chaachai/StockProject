/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commande;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class CommandeServiceTest {
    
    public CommandeServiceTest() {
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
     * Test of initDB method, of class CommandeService.
     */
    @Test
    public void testInitDB() {
        System.out.println("initDB");
        CommandeService instance = new CommandeService();
        instance.initDB();
    }

//    /**
//     * Test of addCommande method, of class CommandeService.
//     */
//    @Test
//    public void testAddCommande() {
//        System.out.println("addCommande");
//        double quantity = 0.0;
//        String dateCommande = "";
//        String clientID = "";
//        String productID = "";
//        CommandeService instance = new CommandeService();
//        instance.addCommande(quantity, dateCommande, clientID, productID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByCriteria method, of class CommandeService.
//     */
//    @Test
//    public void testFindByCriteria() {
//        System.out.println("findByCriteria");
//        String commandeID = "";
//        String productID = "";
//        String clientID = "";
//        double maxQuantity = 0.0;
//        double minQuantity = 0.0;
//        Date minDate = null;
//        Date maxDate = null;
//        CommandeService instance = new CommandeService();
//        List<Commande> expResult = null;
//        List<Commande> result = instance.findByCriteria(commandeID, productID, clientID, maxQuantity, minQuantity, minDate, maxDate);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
