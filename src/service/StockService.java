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

    StoreService storeService = new StoreService();
    ProductService productService = new ProductService();

    public void initDB() {
        addStock("#ST-01", "#09", "P07", 5000);
        addStock("#ST-02", "#05", "P01", 60000);
        addStock("#ST-03", "#01", "P02", 560);
        addStock("#ST-04", "#05", "P01", 5000);
        addStock("#ST-05", "#10", "P03", 7000);
        addStock("#ST-06", "#04", "P07", 1500);
        addStock("#ST-07", "#10", "P03", 260);
        addStock("#ST-08", "#08", "P02", 10000);
        addStock("#ST-09", "#01", "P04", 30000);
        addStock("#ST-10", "#03", "P05", 600);
    }

    public int addStock(String stockID, String storeID, String productID, double quantity) {
        if (findByStoreAndProduct(storeID, productID) == null) {
            createStock(stockID, storeID, productID, quantity);
            return 1;
        } else {
            updateStock(storeID, productID, quantity);
            return 2;
        }
    }

    public void createStock(String stockID, String storeID, String productID, double quantity) {
        Stock stock = new Stock();
        Store store = storeService.find(storeID);
        Product product = productService.find(productID);
        stock.setId(stockID);
        stock.setQuantity(quantity);
        stock.setStore(store);
        stock.setProduct(product);
        create(stock);
    }

    public void updateStock(String storeID, String productID, double quantity) {
        Stock stock = findByStoreAndProduct(storeID, productID);
        stock.setQuantity(stock.getQuantity() + quantity);
        edit(stock);
    }

    public Stock findByStoreAndProduct(String storeID, String productID) {
        Store store = storeService.find(storeID);
        Product product = productService.find(productID);
        List<Stock> stocks = findAll();
        if (store == null || product == null) {
            return null;
        } else {
            for (int i = 0; i < stocks.size(); i++) {
                Stock stock = stocks.get(i);
                if (stock.getProduct().equals(product) && stock.getStore().equals(store)) {
                    return stocks.get(i);
                }
            }
            return null;
        }
    }

    public List<Stock> findByCriteria(String stockID, String productID, String storeID, double maxQuantity, double minQuantity) {
        String query = "SELECT s FROM Stock s WHERE 1 = 1 ";
        if (stockID != null) {
            query += " AND s.id ='" + stockID + "'";
        }
        if (storeID != null) {
            query += " AND s.store.id ='" + storeID + "'";
        }
        if (productID != null) {
            query += " AND s.product.id ='" + productID + "'";
        }
        if (maxQuantity != 0) {
            query += " AND s.quantity < " + maxQuantity;
        }
        if (minQuantity != 0) {
            query += " AND s.quantity > " + minQuantity;
        }
        return getEntityManager().createQuery(query).getResultList();
    }

    public int deleteStock(String storeID, String productID, double quantity) {
        Stock stock = findByStoreAndProduct(storeID, productID);
        if (stock.getQuantity() < quantity) {
            return -1;
        } else {
            stock.setQuantity(stock.getQuantity() - quantity);
            edit(stock);
            return 1;
        }
    }

    public double findGlobalQuantity(String productID) {
        Product product = productService.find(productID);
        List<Stock> stocks = findAll();
        double globalQuantity = 0.0;
        if (product == null) {
            return -1;
        } else if (stocks.isEmpty()) {
            return -2;
        } else {
            for (Stock stock : stocks) {
                if (stock.getProduct().equals(product)) {
                    globalQuantity += stock.getQuantity();
                }
            }
            return globalQuantity;
        }

    }

}
