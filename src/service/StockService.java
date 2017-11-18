/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Product;
import bean.Stock;
import bean.Store;
import java.util.List;

/**
 *
 * @author Yougata
 */
public class StockService extends AbstractFacade<Stock> {

    public StockService() {
        super(Stock.class);
    }

    public List<Stock> findByCriteria(String idPro, String idStore) {
        String query = "SELECT s FROM Stock s WHERE 1=1";
        if (idPro != null) {
            query += " AND s.product.id='" + idPro + "'";
        }
        if (idStore != null) {
            query += " AND s.store.id='" + idStore + "' ";
        }
        return getEntityManager().createQuery(query).getResultList();
    }

    public int CréerStock(String id, double quantity, String idStore, String idProduct) {

        //Stock sr = (Stock) getEntityManager().createQuery("SELECT s FROM Stock s WHERE s.magasin.id ='" + idMagasin + "' AND s.produit.id='" + idProduit + "'").getSingleResult();
        ProductService productService = new ProductService();
        StoreService storeService = new StoreService();
        Product pr = productService.find(idProduct);
        Store st = storeService.find(idStore);
        List<Stock> store = findByCriteria(idProduct, idStore);

        if (store != null) {

            store.get(1).setQuantity(store.get(1).getQuantity() + quantity);
            edit(store.get(1));
            return 1;
        } 
        store.get(1).setStore(st);
        store.get(1).setProduct(pr);
        store.get(1).setQuantity(quantity);
        create(store.get(1));

        return 2;
    }

}
