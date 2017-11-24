/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Stock;
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
public class StockServiceTest {

    public StockServiceTest() {
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

//    /**
//     * Test of initDB method, of class StockService.
//     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        StockService instance = new StockService();
//        instance.initDB();
//    }
//
//    /**
//     * Test of addStock method, of class StockService.
//     */
//    @Test
//    public void testAddStock() {
//        System.out.println("addStock");
//        String stockID = "";
//        String storeID = "";
//        String productID = "";
//        double quantity = 0.0;
//        StockService instance = new StockService();
//        int expResult = 0;
//        int result = instance.addStock(stockID, storeID, productID, quantity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createStock method, of class StockService.
//     */
//    @Test
//    public void testCreateStock() {
//        System.out.println("createStock");
//        String stockID = "";
//        String storeID = "";
//        String productID = "";
//        double quantity = 0.0;
//        StockService instance = new StockService();
//        instance.createStock(stockID, storeID, productID, quantity);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateStock method, of class StockService.
//     */
//    @Test
//    public void testUpdateStock() {
//        System.out.println("updateStock");
//        String storeID = "";
//        String productID = "";
//        double quantity = 0.0;
//        StockService instance = new StockService();
//        instance.updateStock(storeID, productID, quantity);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByStoreAndProduct method, of class StockService.
//     */
//    @Test
//    public void testFindByStoreAndProduct() {
//        System.out.println("findByStoreAndProduct");
//        String storeID = "";
//        String productID = "";
//        StockService instance = new StockService();
//        Stock expResult = null;
//        Stock result = instance.findByStoreAndProduct(storeID, productID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteStock method, of class StockService.
//     */
//    @Test
//    public void testDeleteStock() {
//        System.out.println("deleteStock");
//        String storeID = "";
//        String productID = "";
//        double quantity = 0.0;
//        StockService instance = new StockService();
//        int expResult = 0;
//        int result = instance.deleteStock(storeID, productID, quantity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findGlobalQuantity method, of class StockService.
//     */
//    @Test
//    public void testFindGlobalQuantity() {
//        System.out.println("findGlobalQuantity");
//        String productID = "";
//        StockService instance = new StockService();
//        double expResult = 0.0;
//        double result = instance.findGlobalQuantity(productID);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of findByProduct method, of class StockService.
     */
//    @Test
//    public void testFindByProduct() {
//        System.out.println("findByProduct");
//        String idProduct = "P01";
//        StockService instance = new StockService();
//        List<Stock> result = instance.findByProduct(idProduct);
//        System.out.println(result);
//    }
    /**
     * Test of findByCriteria method, of class StockService.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        String stockID = null;
        String storeID = null;
        String productID = null;
        double maxQuantity = 0.0;
        double minQuantity = 5000.0;
        StockService instance = new StockService();
        List<Stock> result = instance.findByCriteria(stockID, productID, storeID, maxQuantity, minQuantity);
        System.out.println(result);
    }

}
