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
public class StoreServiceTest {
    
    public StoreServiceTest() {
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
     * Test of initBD method, of class StoreService.
     */
    @Test
    public void testInitBD() {
        System.out.println("initBD");
        StoreService instance = new StoreService();
        instance.initBD();
    }

    /**
     * Test of createStore method, of class StoreService.
     */
//    @Test
//    public void testCreateStore() {
//        System.out.println("createStore");
//        String storeID = "";
//        String name = "";
//        String address = "";
//        String city = "";
//        String phone = "";
//        StoreService instance = new StoreService();
//        instance.createStore(storeID, name, address, city, phone);
//    }
    
}
