/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Store;

/**
 *
 * @author Yougata
 */
public class StoreService extends AbstractFacade<Store>{
    
    public StoreService() {
        super(Store.class);
    }
    public int CreateStore(String id,String name,String phone,String address, String city){
        Store st = new Store(id, address, city, name, phone);
        create(st);
        return 1;
        
    }
    
    
}
