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
public class ProductServiceTest {

    public ProductServiceTest() {
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
     * Test of CreateProduct method, of class ProductService.
     */
//    @Test
//    public void testCreateProduct() {
//        System.out.println("CreateProduct");
//        String id = "P01";
//        String Name = "TOSHIBA";
//        double unitPrice = 5000.0;
//        String idCategory = "1";
//        ProductService instance = new ProductService();
//        int result = instance.createProduct(id, Name, unitPrice, idCategory);
//        System.out.println(result);
//    }

    /**
     * Test of initDB method, of class ProductService.
     */
    @Test
    public void testInitDB() {
        System.out.println("initDB");
        ProductService instance = new ProductService();
        instance.initDB();
    }

}
