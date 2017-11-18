/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Category;
import bean.Product;

/**
 *
 * @author Yougata
 */
public class ProductService extends AbstractFacade<Product> {

    public ProductService() {
        super(Product.class);
    }

    public int CreateProduct(String id, String Name, double unitPrice, String idCategory) {
        Product pr = new Product(id, Name, unitPrice);
        CategoryService categoryService = new CategoryService();
        Category category = categoryService.find(idCategory);
        pr.setCategory(category);
        create(pr);
        return 1;

    }

//    public void creatProduct(String productID, String name, ) {
//        Product product = new Product();
//        product.setId(productID);
//        product.setName(name);
//        product.setType(type);
//        product.setBuyPrice(buyingPrice);
//        product.setSellPrice(sellingPrice);
//        create(product);
//    }
}
