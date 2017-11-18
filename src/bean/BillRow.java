/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
@Entity
public class BillRow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private double quantity;
    private double vat;
    private double priceInclTax;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Bill bill;

    public BillRow() {
    }

    public BillRow(String id) {
        this.id = id;
    }

    public BillRow(String id, double quantity, double vat, double priceInclTax) {
        this.id = id;
        this.quantity = quantity;
        this.vat = vat;
        this.priceInclTax = priceInclTax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getPriceInclTax() {
        return priceInclTax;
    }

    public void setPriceInclTax(double priceInclTax) {
        this.priceInclTax = priceInclTax;
    }

    public Product getProduct() {
        if (product == null) {
            product = new Product();
        }
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bill getBill() {
        if (bill == null) {
            bill = new Bill();
        }
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BillRow)) {
            return false;
        }
        BillRow other = (BillRow) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BillRow{" + "id=" + id + ", quantity=" + quantity + ", vat=" + vat + ", priceInclTax=" + priceInclTax + '}';
    }

    
}
