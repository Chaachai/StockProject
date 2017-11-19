/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class ClientService extends AbstractFacade<Client> {
    
    public ClientService() {
        super(Client.class);
    }
    
    public void initDB() {
        addClient("C01", "CHAACHAI", "Youssef", "Sidi Abbad", "+212642112113");
        addClient("C02", "OUALILI", "Younesse", "Sidi Abbad", "+212654789621");
        addClient("C03", "ZOUANI", "Youness", "Sidi Youssef", "+212685214789");
        addClient("C04", "AHMED", "Moussa", "Guiliz", "+21267896541");
        addClient("C05", "MOHAMMED", "Ali", "Daoudiate", "+212612345678");
        addClient("C06", "BENCHARKI", "Achraf", "Massira", "+212645685225");
        
    }
    
    public void addClient(String ClientID, String LastName, String FirstName, String Address, String Phone){
        Client client = new Client(ClientID, LastName, FirstName, Address, Phone);
        create(client);
    }
    public List<Client> findByCriteria(String id, String firstName, String lastName,String address,String phone) {
        String query = "SELECT c FROM Client c WHERE 1=1";
        if(id!=null){
            query += " AND c.id='"+id+"'";
        }
        if (firstName != null) {
            query += " AND c.firsName='" + firstName + "'";
        }
        
        if (lastName != null) {
            query += " AND c.lastName='" + lastName + "'";
        }
        if (address != null) {
            query += " AND c.address='" + address + "'";
        }
        if (phone != null) {
            query += " AND c.phone='" + phone + "'";
        }
        
        return getEntityManager().createQuery(query).getResultList();
    }
    
    public int DeleteByCriteria(String id, String firstName, String lastName,String address,String phone) {
        String query = "DELETE  FROM Client c WHERE 1=1";
        if(id!=null){
            query += " AND c.id='"+id+"'";
        }
        if (firstName != null) {
            query += " AND c.firsName='" + firstName + "'";
        }
        
        if (lastName != null) {
            query += " AND c.lastName='" + lastName + "'";
        }
        if (address != null) {
            query += " AND c.address='" + address + "'";
        }
        if (phone != null) {
            query += " AND c.phone='" + phone + "'";
        }
        
        return getEntityManager().createQuery(query).executeUpdate();
    }
}
