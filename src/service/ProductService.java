/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Product;

/**
 *
 * @author Yougata
 */
public class ProductService extends AbstractFacade<Product>{
    
    public ProductService() {
        super(Product.class);
    }
    public int CreateProduct(String id,String Nom,double unitPrice){
        Product pr = new Product(id, Nom, unitPrice);
        create(pr);
        return 1;
        
    }
    
}
