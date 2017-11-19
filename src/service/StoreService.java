/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Store;
import java.util.List;

/**
 *
 * @author Yougata
 */
public class StoreService extends AbstractFacade<Store>{
    
    public StoreService() {
        super(Store.class);
    }
    
    public void initBD() {
        createStore("#01", "Downtown Seattle", "500 Pine Street", "Seattle", "+212506798456");
        createStore("#02", "Northgate", "401 N.E Northgate Way", "Seattle", "+212552369741");
        createStore("#03", "Southcenter Square Rack", "17200 Southcenter Parkway, Suite 110", "Tukwila", "+212597364558");
        createStore("#04", "Bellevue Square", "100 Bellevue Square", "Bellvue", "+212564589732");
        createStore("#05", "Southcenter", "100 Southcenter Shopping Center", "Tukwila", "+212565498732");
        createStore("#06", "Tacoma Mall", "4502 S. Steele Street, Suite 800", "Tacoma", "+212577982346");
        createStore("#07", "Spokane", "828 W. Main Avenue", "Spokane", "+212546468291");
        createStore("#08", "Alderwood", "3200 184th Street SW", "Lynnwood", "+212593366458");
        createStore("#09", "Anchorage Rack", "680 E. Northern Lights Boulevard", "Anchorage", "+212567139824");
        createStore("#10", "Anchorage", "603 D Street", "Anchorage", "+212575364128");
    }
    
    public void createStore(String storeID, String name, String address, String city, String phone) {
        Store store = new Store();
        store.setId(storeID);
        store.setName(name);
        store.setCity(city);
        store.setAddress(address);
        store.setPhone(phone);
        create(store);
    }
    public List<Store> findByCriteria(String id,String name,String phone,String address, String city) {
        String query = "SELECT s FROM Store s WHERE 1=1";
        if(id!=null){
            query += " AND s.id='"+id+"'";
        }
        if (name != null) {
            query += " AND s.name='" + name + "'";
        }
        if (phone != null) {
            query += " AND s.phone='" + phone + "' ";
        }
        if (address != null) {
            query += " AND s.address='" + address + "'";
        }
        if (city != null) {
            query += " AND s.city='" + city + "' ";
        }
        return getEntityManager().createQuery(query).getResultList();
    }
    public int DeleteByCriteria(String id,String name,String phone,String address, String city) {
        String query = "DELETE  FROM Store s WHERE 1=1";
        if(id!=null){
            query += " AND s.id='"+id+"'";
        }
        if (name != null) {
            query += " AND s.name='" + name + "'";
        }
        if (phone != null) {
            query += " AND s.phone='" + phone + "' ";
        }
        if (address != null) {
            query += " AND s.address='" + address + "'";
        }
        if (city != null) {
            query += " AND s.city='" + city + "' ";
        }
        return getEntityManager().createQuery(query).executeUpdate();
    }
    
}
