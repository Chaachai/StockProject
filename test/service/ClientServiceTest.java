/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
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
public class ClientServiceTest {

    public ClientServiceTest() {
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
     * Test of initDB method, of class ClientService.
     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        ClientService instance = new ClientService();
//        instance.initDB();
//    }
//
//    /**
//     * Test of addClient method, of class ClientService.
//     */
//    @Test
//    public void testAddClient() {
//        System.out.println("addClient");
//        String ClientID = "";
//        String LastName = "";
//        String FirstName = "";
//        String Address = "";
//        String Phone = "";
//        ClientService instance = new ClientService();
//        instance.addClient(ClientID, LastName, FirstName, Address, Phone);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of findByCriteria method, of class ClientService.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        String clientID = null;
        String lastName = null;
        String firstName = null;
        ClientService instance = new ClientService();
        List<Client> result = instance.findByCriteria(clientID, lastName, firstName);
        System.out.println(result);
    }

}
