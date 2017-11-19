/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Commande;
import bean.Product;
import javax.persistence.criteria.Order;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class OrderService extends AbstractFacade<Commande> {

    ClientService clientService = new ClientService();
    ProductService productService = new ProductService();

    public OrderService() {
        super(Commande.class);
    }

    public void initDB() {
        addOrder(5, "24/01/2015", "C01", "P05");
        addOrder(2, "22/09/2016", "C06", "P01");
        addOrder(1, "13/02/2017", "C03", "P06");
        addOrder(1, "05/05/2017", "C02", "P02");
        addOrder(1, "15/11/2017", "C05", "P03");
    }

    public void addOrder(double quantity, String orderDate, String clientID, String productID) {
        Commande commande = new Commande();
        Client client = clientService.find(clientID);
        Product product = productService.find(productID);
        commande.setQuantity(quantity);
        commande.setOrderDate(orderDate);
        commande.setTotalPrice(product.getUnitPrice()*quantity);
        commande.setClient(client);
        commande.setProduct(product);
        create(commande);
    }

}
