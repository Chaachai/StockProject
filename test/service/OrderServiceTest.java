/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

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
public class OrderServiceTest {
    
    public OrderServiceTest() {
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
     * Test of initDB method, of class OrderService.
     */
    @Test
    public void testInitDB() {
        System.out.println("initDB");
        OrderService instance = new OrderService();
        instance.initDB();
    }

    /**
     * Test of addOrder method, of class OrderService.
     */
//    @Test
//    public void testAddOrder() {
//        System.out.println("addOrder");
//        double quantity = 0.0;
//        String orderDate = "";
//        String clientID = "";
//        String productID = "";
//        double totalPrice = 0.0;
//        OrderService instance = new OrderService();
//        instance.addOrder(quantity, orderDate, clientID, productID, totalPrice);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
