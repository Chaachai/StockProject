/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Commande;
import bean.Product;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class CommandeService extends AbstractFacade<Commande> {

    ClientService clientService = new ClientService();
    ProductService productService = new ProductService();
    //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public CommandeService() {
        super(Commande.class);
    }

    public void initDB() {
        addCommande(5, "24/01/2015", "C01", "P05");
        addCommande(2, "22/09/2016", "C06", "P01");
        addCommande(1, "13/02/2017", "C03", "P06");
        addCommande(1, "05/05/2017", "C02", "P02");
        addCommande(1, "15/11/2017", "C05", "P03");
    }

    public void addCommande(Date dateCommande, String clientID, String productID) {
        Commande commande = new Commande();
        Client client = clientService.find(clientID);
        Product product = productService.find(productID);
        commande.setQuantity(quantity);
        //dateCommande = formatter.format(commande.getDateCommande());
        commande.setDateCommande(dateCommande);
        commande.setTotalPrice(product.getUnitPrice() * quantity);
        commande.setClient(client);
        commande.setProduct(product);
        create(commande);
    }

    public List<Commande> findByCriteria(String commandeID, String productID,
            String clientID, double maxQuantity, double minQuantity, Date minDate, Date maxDate) {
        String query = "SELECT c FROM Commande c WHERE 1 = 1 ";
        if (commandeID != null) {
            query += " AND c.id ='" + commandeID + "'";
        }
        if (productID != null) {
            query += " AND c.product.id ='" + productID + "'";
        }
        if (clientID != null) {
            query += " AND c.client.id ='" + clientID + "'";
        }
        if (maxQuantity != 0) {
            query += " AND c.quantity < " + maxQuantity;
        }
        if (minQuantity != 0) {
            query += " AND c.quantity > " + minQuantity;
        }
        if (maxDate != null) {
            query += " AND c.orderDate < " + maxDate;
        }
        if (minDate != null) {
            query += " AND c.orderDate > " + maxDate;
        }

        return getEntityManager().createQuery(query).getResultList();
    }

}
