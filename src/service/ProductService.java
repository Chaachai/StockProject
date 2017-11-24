/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Category;
import bean.Product;
import java.util.List;

/**
 *
 * @author Yougata
 */
public class ProductService extends AbstractFacade<Product> {

    public ProductService() {
        super(Product.class);
    }

    public void initDB() {
        createProduct("P01", "TOSHIBA", 5000, "51");
        createProduct("P02", "NOKIA", 2500, "52");
        createProduct("P03", "DELL", 4500, "51");
        createProduct("P04", "HP", 5000, "54");
        createProduct("P05", "LG", 7500, "53");
        createProduct("P06", "ALCATEL", 2150, "52");
        createProduct("P07", "CANON", 6570, "55");
    }

    public int createProduct(String id, String Name, double unitPrice, String idCategory) {
        Product pr = new Product(id, Name, unitPrice);
        CategoryService categoryService = new CategoryService();
        Category category = categoryService.find(idCategory);
        pr.setCategory(category);
        create(pr);
        return 1;

    }

    public List<Product> findByCriteria(String productID, String categoryID, String name, double maxPrice, double minPrice) {
        String query = "SELECT p FROM Product p WHERE 1 = 1 ";
        if (productID != null) {
            query += " AND p.id ='" + productID + "'";
        }
        if (categoryID != null) {
            query += " AND p.category.id ='" + categoryID + "'";
        }
        if (name != null) {
            query += " AND p.name ='" + name + "'";
        }
        if (maxPrice != 0) {
            query += " AND p.unitPrice < " + maxPrice;
        }
        if (minPrice != 0) {
            query += " AND p.unitPrice > " + minPrice;
        }
        return getEntityManager().createQuery(query).getResultList();
    }

}
